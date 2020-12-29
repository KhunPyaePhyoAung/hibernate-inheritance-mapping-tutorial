package me.khun.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "regular_employee")
@Getter
@Setter
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "id")),
        @AttributeOverride(name = "name", column = @Column(name = "name"))
})
public class RegularEmployee extends Employee{

    @Column(name = "salary")
    private Double salary;

    @Column(name = "bonus")
    private Double bonus;
}
