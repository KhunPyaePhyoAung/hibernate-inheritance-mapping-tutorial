package me.khun.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "contract_employee")
@Getter
@Setter
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "id")),
        @AttributeOverride(name = "name", column = @Column(name = "name"))
})
public class ContractEmployee extends Employee{

    @Column(name = "pay_per_hour")
    private Double payPerHour;

    @Column(name = "contract_period")
    private String contractPeriod;
}
