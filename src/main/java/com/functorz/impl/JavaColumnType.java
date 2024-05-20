package com.functorz.impl;

import lombok.AllArgsConstructor;
import lombok.Data;

public interface JavaColumnType {
  static JavaColumnType from(Class javaClass, boolean isEnum, boolean isJsonb) {
    if (isEnum) {
      return new JavaEnumColumn();
    }
    if (isJsonb) {
      return new JavaJsonColumn();
    }
    return new JavaClassColumn(javaClass);
  }
  default boolean isEnum() {
    return false;
  }

  default boolean isJsonb() {
    return false;
  }

  default Class getJavaClass() {
    return null;
  }
}

class JavaEnumColumn implements JavaColumnType {
  @Override
  public boolean isEnum() {
    return true;
  }

  @Override
  public String toString() {
    return "Enum";
  }
}

class JavaJsonColumn implements JavaColumnType {
  @Override
  public boolean isJsonb() {
    return true;
  }

  @Override
  public String toString() {
    return "Json";
  }
}

@AllArgsConstructor
class JavaClassColumn implements JavaColumnType {
  private Class javaClass;

  @Override
  public String toString() {
    return javaClass.getSimpleName();
  }

  @Override
  public Class getJavaClass() {
    return javaClass;
  }
}
