package com.bridgelabz;

import java.util.Random;

enum EmployeeType {
    FULL_TIME,
    PART_TIME
}
/**
 * Employee class to deal with employee related data
 */
public class Employee {
    private EmployeeType employeeType;
    private int empHrs;
    private int wagePerHr;

    Employee(EmployeeType employeeType, int empHrs, int wagePerHr) {
        this.employeeType = employeeType;
        this.empHrs = empHrs;
        this.wagePerHr = wagePerHr;
    }

    Employee() {

    }

    public int getEmpHrs() {
        return empHrs;
    }

    public int getWagePerHr() {
        return wagePerHr;
    }

    /**
     * This method will check whether the given employee is prent or absent
     * @return true if employee is present, false otherwise
     */
    public boolean isPresent() {
        Random random = new Random(2);
        return random.nextInt() == 1;
    }
}
