/**
 * Calculating [art time employee wage
 */
package com.bridgelabz;

public class ParttimeEmployeeWageUC3 {
    public static void main(String[] args) {
        /**
         * passing values for partTime employee through constructor
         */
        Employee employee = new Employee(EmployeeType.PART_TIME, 4, 20);
        System.out.println("Part time Employee Daily Wage: "+employee.getEmpHrs() * employee.getWagePerHr());
    }
}
