**This is a tiny tool to convert jpa entity to psql, for saving my time.**

TODO:
- [ ] build intellij plugin

Test case
```java
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commission {
  @GraphQLIgnore
  @Id
  @Min(DbConstants.INCREMENT * DbConstants.COMMISSION_OFFSET)
  @Max(DbConstants.INCREMENT * (DbConstants.COMMISSION_OFFSET + 1))
  @GeneratedValue(generator = "commission_pk_seq", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(
      name = "commission_pk_seq",
      sequenceName = "commission_pk_seq",
      allocationSize = 1)
  private Long id;

  @Column private long orderId;

  @Column private long commissionAccountId;

  @Column(nullable = false)
  private BigDecimal commissionAmount;

  @Column
  @Enumerated(EnumType.STRING)
  private CommissionStatus status;

  @Column private String errorMessage;

  @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE", updatable = false, nullable = false)
  @CreationTimestamp
  private OffsetDateTime createdAt;

  @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE", updatable = false)
  @UpdateTimestamp
  private OffsetDateTime updatedAt;
}
```

Convert to:
```sql
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
```
