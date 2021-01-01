package me.khun.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "regular_employee")
@PrimaryKeyJoinColumn(name = "employee_id")
@Getter
@Setter
public class RegularEmployee extends Employee{

    @Column(name = "salary")
    private Double salary;

    @Column(name = "bonus")
    private Double bonus;
}
