package org.humanbboster.myproject.model;

import java.util.ArrayList;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private BankInfo bankInfo;
    private Company company;
    private Status status;

    public Employee(String firstName, String lastName, double salary, BankInfo bankInfo, Company company, Status status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.bankInfo = bankInfo;
        this.company = company;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public BankInfo getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(BankInfo bankInfo) {
        this.bankInfo = bankInfo;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", bankInfo=").append(bankInfo);
        sb.append(", company=").append(company);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
