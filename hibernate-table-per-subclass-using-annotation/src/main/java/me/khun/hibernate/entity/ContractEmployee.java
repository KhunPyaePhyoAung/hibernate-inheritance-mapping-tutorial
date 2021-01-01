package me.khun.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "contract_employee")
@PrimaryKeyJoinColumn(name = "employee_id")
@Getter
@Setter
public class ContractEmployee extends Employee{

    @Column(name = "pay_per_hour")
    private Double payPerHour;

    @Column(name = "contract_period")
    private String contractPeriod;
}
