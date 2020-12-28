package me.khun.hibernate.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "regular_employee")
@Getter
@Setter
public class RegularEmployee extends Employee{

    @Column(name = "salary")
    private Double salary;

    @Column(name = "bonus")
    private Double bonus;
}
