/**
 * Calculating employee wage per month
 */
package com.bridgelabz;

public class EmployeeMonthlyWageUC5 {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new Employee(EmployeeType.FULL_TIME, 8, 20);
        int monthlyWage = 0;
        for(int i=1; i<=20; i++) {
            if (fullTimeEmployee.isPresent()) {
                monthlyWage+=(fullTimeEmployee.getEmpHrs() * fullTimeEmployee.getWagePerHr());
            }
        }
        System.out.println("Employee Monthly wage: $"+monthlyWage);
    }
}
