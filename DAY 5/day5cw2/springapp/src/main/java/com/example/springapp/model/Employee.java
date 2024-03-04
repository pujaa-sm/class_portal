package com.example.springapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
   
    int employeeId;
    int department;
    String employeeName,employeeEmail;
    double salary;
    public Employee() {
    }
    public Employee(int employeeId, int department, String employeeName, String employeeEmail, double salary) {
        this.employeeId = employeeId;
        this.department = department;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.salary = salary;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmployeeEmail() {
        return employeeEmail;
    }
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
