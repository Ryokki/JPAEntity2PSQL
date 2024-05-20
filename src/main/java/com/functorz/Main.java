package com.functorz;

import com.functorz.impl.Converter;
import com.functorz.test.Commission;

public class Main {
  public static void main(String[] args) {
    System.out.println(Converter.genSQL(Commission.class));

    /*
CREATE TABLE IF NOT EXISTS commission (
     id BIGINT,
     order_id BIGINT NOT NULL,
     commission_account_id BIGINT NOT NULL,
     commission_amount NUMERIC NOT NULL,
     status TEXT,
     error_message TEXT,
     created_at TIMESTAMP WITH TIMEZONE NOT NULL,
     updated_at TIMESTAMP WITH TIMEZONE,
     CONSTRAINT pk_commission PRIMARY KEY (id)
);

CREATE SEQUENCE IF NOT EXISTS commission_pk_seq START WITH 8360000000000001 INCREMENT BY 1 NO MINVALUE NO MAXVALUE CACHE 1;
     */
  }
}
