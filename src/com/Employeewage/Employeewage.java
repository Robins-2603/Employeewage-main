package com.Employeewage;

public class Employeewage {
    public static final int Is_Full_time = 1;
    public static final int Is_part_time = 2;
    public static final int Emp_wage_per_hr = 20;
    public static void main(String[] args) {
        System.out.println("welcome to Employee wage computation program");

        int Emp_hrs;
        int Salary;
        double empcheck= Math.floor(Math.random()*10) % 3;
        switch ((int) empcheck) {
            case Is_Full_time:
                System.out.println("Employee is Present");
                Emp_hrs = 8;
                break;
            case Is_part_time:
                System.out.println("Employee is Half day Working");
                Emp_hrs = 4;

            default:
                System.out.println("Employee is Absent");
                Emp_hrs = 0;
        }
        Salary=Emp_wage_per_hr*Emp_hrs;
        System.out.println("Daily wage of Employee is "+ Salary);


    }
}
