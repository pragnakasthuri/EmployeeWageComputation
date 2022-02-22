package com.bridgelabz;

public class EmployeeWageComputationUC1 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Employee is "+(employee.isPresent() ? "Present" : "Absent"));
    }
}
