package com.functorz.impl;

import ch.qos.logback.classic.db.SQLBuilder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.apache.bcel.classfile.JavaClass;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.Min;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import com.google.common.base.CaseFormat;

public class Converter {
  public static void printColumnTypes(Class<?> entityClass) {

    if (entityClass.isAnnotationPresent(Entity.class)) {
      Field[] fields = entityClass.getDeclaredFields();
      for (Field field : fields) {
        if (field.isAnnotationPresent(Id.class) || field.isAnnotationPresent(Column.class)) {
          System.out.println("Field: " + field.getName() + ", Type: " + field.getType().getSimpleName());
        }
      }
    } else {
      System.out.println("The class " + entityClass.getSimpleName() + " is not a JPA entity.");
    }
  }

  private static boolean isFieldNullable(Column column, Class javaClass) {
    return column.nullable() && !javaClass.isPrimitive();
  }

  private static Field getIdField(Class<?> entityClass) {
    return Arrays.stream(entityClass.getDeclaredFields())
        .filter(field -> field.isAnnotationPresent(Id.class))
        .findFirst().orElseThrow();
  }

  public static List<JavaColumnInfo> generateJavaColumnInfo(Class<?> entityClass){
    if (!entityClass.isAnnotationPresent(Entity.class)) {
      throw new IllegalArgumentException("must be jpa entity");
    }
    List<JavaColumnInfo> list = Arrays.stream(entityClass.getDeclaredFields())
        .filter(field -> field.isAnnotationPresent(Id.class) || field.isAnnotationPresent(Column.class))  // ignore join and so on
        .map(field -> {
          Class javaClass = field.getType();
          String fieldName = field.getName();
          if (field.isAnnotationPresent(Id.class)) {
            return new JavaColumnInfo(new JavaClassColumn(javaClass),fieldName, true);
          }
          Column column = field.getAnnotation(Column.class);
          boolean isEnum = field.isAnnotationPresent(Enumerated.class);
          boolean isJson = "jsonb".equals(column.columnDefinition());
          return new JavaColumnInfo(JavaColumnType.from(javaClass, isEnum, isJson), fieldName, isFieldNullable(column, javaClass));
        })
        .collect(Collectors.toList());
    return list;
  }

  private static String getTableName(String className) {
    return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, className);
  }


  public static String genCreateTableSql(Class<?> entityClass) {
    StringBuilder sb = new StringBuilder();
    String tab = "     ";
    appendWithLineBreak(sb, String.format("CREATE TABLE IF NOT EXISTS %s (", getTableName(entityClass.getSimpleName())));
    generateJavaColumnInfo(entityClass)
        .forEach(info -> appendWithLineBreak(sb, tab + info.columnSql() + ","));
    appendWithLineBreak(sb, tab + "CONSTRAINT pk_commission PRIMARY KEY (id)");
    appendWithLineBreak(sb, ");");
    return sb.toString();
  }

  public static String genCreateSeqSql(Class<?> entityClass) {
    Field idField = getIdField(entityClass);
    long minId = idField.getAnnotation(Min.class).value();
    String seqName = idField.getAnnotation(GeneratedValue.class).generator();
    return String.format("CREATE SEQUENCE IF NOT EXISTS %s START WITH %s INCREMENT BY 1 NO MINVALUE NO MAXVALUE CACHE 1;\n", seqName, minId + 1);
  }

  public static String genSQL(Class<?> entityClass) {
    return genCreateTableSql(entityClass) + "\n" + genCreateSeqSql(entityClass);
  }

  private static void appendWithLineBreak(StringBuilder sb, String content) {
    sb.append(content);
    sb.append("\n");
  }
}
