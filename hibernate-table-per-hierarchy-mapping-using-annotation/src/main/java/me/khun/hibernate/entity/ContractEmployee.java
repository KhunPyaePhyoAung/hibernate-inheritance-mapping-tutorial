package me.khun.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "contract_employee")
@Getter
@Setter
public class ContractEmployee extends Employee{

    @Column(name = "pay_per_hour")
    private Double payPerHour;

    @Column(name = "contract_period")
    private String contractPeriod;
}
