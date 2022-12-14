package com.example.shoppingDemo.entities.concretes;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SuperBuilder
@Table(name = "corporate_customers")
@PrimaryKeyJoinColumn(name = "corporate_customer_id", referencedColumnName = "customer_id")
@EqualsAndHashCode(callSuper = true)
public class CorporateCustomer extends Customer{
    @Column(name = "corporate_customer_id", insertable = false, updatable = false)
    private int corporateCustomerId;
    @Column(name = "tax_number")
    private String taxNumber;
    @Column(name = "company_name")
    private String companyName;

}
