package me.khun.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegularEmployee extends Employee{
    private Double salary;
    private Double bonus;
}
