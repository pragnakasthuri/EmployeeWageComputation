package com.bridgelabz;

public class ParttimeEmployeeWageUC3 {
    public static void main(String[] args) {
        Employee employee = new Employee(EmployeeType.PART_TIME, 4, 20);
        System.out.println("Parttime Employee Daily Wage: "+employee.getEmpHrs() * employee.getWagePerHr());
    }
}
