package me.khun.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContractEmployee extends Employee{
    private Double payPerHour;
    private String contractPeriod;
}
