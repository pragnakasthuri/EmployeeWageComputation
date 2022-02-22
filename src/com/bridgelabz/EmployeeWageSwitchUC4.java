package com.bridgelabz;

public class EmployeeWageSwitchUC4 {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new Employee(EmployeeType.FULL_TIME, 8, 20);
        Employee partTimeEmployee = new Employee(EmployeeType.PART_TIME, 4, 20);
        switch (fullTimeEmployee.getEmployeeType()) {
            case FULL_TIME:
                System.out.println("Full time Employee Daily Wage : " + fullTimeEmployee.getEmpHrs() * fullTimeEmployee.getWagePerHr());
                break;
            case PART_TIME:
                System.out.println("Part time Employee Daily Wage : " + partTimeEmployee.getEmpHrs() * partTimeEmployee.getWagePerHr());
                break;
            default:
                System.out.println("Invalid employee type!");
        }
    }
}
