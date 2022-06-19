package com.Employeewage;

public class Employeewage {
    public static void main(String[] args) {
        System.out.println("welcome to Employee wage computation program");
        int Is_Full_time = 1;
        int Emp_wage_per_hr = 20;
        int Emp_hrs = 0;
        int Salary = 0;
        double empcheck = Math.floor(Math.random()*10) % 2;
//        System.out.println(empcheck);
        if (empcheck == Is_Full_time) {
            System.out.println("Employee is Present");
            Emp_hrs = 8;
        }
//        System.out.println();
        else {
            System.out.println("Employee is Abscent");
            Emp_hrs = 0;
        }
        Salary=Emp_wage_per_hr*Emp_hrs;
        System.out.println("Daily wage of Employee is "+ Salary);


    }
}
