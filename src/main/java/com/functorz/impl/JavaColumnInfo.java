package com.functorz.impl;


import com.google.common.base.CaseFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JavaColumnInfo {
  private JavaColumnType javaColumnType;
  private String fieldName;
  private boolean nullable;

  public String toString() {
    return javaColumnType.toString() + ", " + fieldName + ", " + "nullable ? " + nullable;
  }

  PgType getMatchedPgType() {
    if (javaColumnType.isEnum()) {
      return PgType.TEXT;
    }
    if (javaColumnType.isJsonb()) {
      return PgType.JSONB;
    }
    PgType pgType = PgType.PG_TYPE_BY_CLASS.get(javaColumnType.getJavaClass());
    if (pgType == null) {
      throw new IllegalArgumentException(String.format("unsupported class %s", javaColumnType.getJavaClass().getSimpleName()));
    }
    return pgType;
  }

  public String columnSql() {
    StringBuilder sb = new StringBuilder();
    String snakeFieldName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, fieldName);
    sb.append(snakeFieldName + " " + getMatchedPgType().getTypeName());;
    if (!nullable) {
      sb.append(" NOT NULL");
    }
    return sb.toString();
  }
}
