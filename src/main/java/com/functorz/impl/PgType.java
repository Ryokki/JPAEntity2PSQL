package com.functorz.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
// it's not completed, but is enough for my use
public enum PgType {
  BIGINT(List.of(long.class, Long.class), "BIGINT"),
  INT((List.of(int.class, Integer.class)), "INTEGER"),
  BOOLEAN(List.of(boolean.class, Boolean.class), "BOOLEAN"),
  FLOAT(List.of(float.class, Float.class), "FLOAT"),
  DOUBLE(List.of(double.class, Double.class), "DOUBLE PRECISION"),
  NUMERIC(List.of(BigDecimal.class), "NUMERIC"),
  TEXT(List.of(String.class), "TEXT"),
  TIMESTAMP_WITH_TIMEZONE(List.of(OffsetDateTime.class), "TIMESTAMP WITH TIMEZONE"),
  JSONB(List.of(), "JSONB"),
  ;

  private final List<Class> matchedClasses;
  private final String typeName;

  public static final Map<Class, PgType> PG_TYPE_BY_CLASS =  Arrays.stream(PgType.values())
      .flatMap(pgType -> pgType.matchedClasses.stream()
          .collect(Collectors.toMap(cls -> cls, cls -> pgType))
          .entrySet().stream())
      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
}
