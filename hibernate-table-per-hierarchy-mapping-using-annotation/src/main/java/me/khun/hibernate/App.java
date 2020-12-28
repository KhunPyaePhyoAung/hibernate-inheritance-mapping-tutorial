package me.khun.hibernate;

import me.khun.hibernate.entity.ContractEmployee;
import me.khun.hibernate.entity.Employee;
import me.khun.hibernate.entity.RegularEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(standardServiceRegistry).buildMetadata();
        SessionFactory sessionFactory = metadata.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee();
        employee.setName("Khun Pyae Phyo Aung");

        RegularEmployee regularEmployee = new RegularEmployee();
        regularEmployee.setName("Khun Tar Tuu");
        regularEmployee.setSalary(200000D);
        regularEmployee.setBonus(10000D);

        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setName("Khun Lar Lay");
        contractEmployee.setPayPerHour(2000D);
        contractEmployee.setContractPeriod("6 months");

        session.persist(employee);
        session.persist(regularEmployee);
        session.persist(contractEmployee);

        transaction.commit();
        session.close();
        System.out.println("Success");
    }
}
