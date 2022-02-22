package com.bridgelabz;

public class EmployeeDailyWageUC2 {

    public static void main(String[] args) {
        Employee employee = new Employee(EmployeeType.FULL_TIME, 8, 20);
        System.out.println("Employee Daily Wage: "+employee.getEmpHrs() * employee.getWagePerHr());
    }
}
