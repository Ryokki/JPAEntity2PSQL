package com.functorz.test;

import io.leangen.graphql.annotations.GraphQLIgnore;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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