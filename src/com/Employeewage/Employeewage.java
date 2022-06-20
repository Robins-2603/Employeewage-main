package com.Employeewage;

public class Employeewage {
    public static final int Is_Full_time = 1;
    public static final int Is_part_time = 2;
    public static final int Emp_wage_per_hr = 20;
    public static final int no_working_days = 20;
    public static final int Total_working_hrs = 100;
    public static void main(String[] args) {
        System.out.println("welcome to Employee wage computation program");

        int Emp_hrs;
        int Salary;
        int total_salary=0;
        int total_wrk_hrs=0;
        int total_wrk_days=0;

        while ( total_wrk_hrs<=Total_working_hrs && total_wrk_days<=no_working_days) {
            total_wrk_days++;
            double empcheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empcheck) {
                case Is_Full_time:
                    System.out.println("Employee is Present");
                    Emp_hrs = 8;
                    break;
                case Is_part_time:
                    System.out.println("Employee is Half day Working");
                    Emp_hrs = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    Emp_hrs = 0;
            }
            Salary = Emp_wage_per_hr * Emp_hrs;
            System.out.println(Salary);
            total_salary = total_salary + Salary;
            total_wrk_hrs = total_wrk_hrs + Emp_hrs;
        }
        System.out.println("Total Empwage is " + total_salary);
        System.out.println("Total EmpHrs is " + total_wrk_hrs);
        System.out.println("Total EmpDays is " + total_wrk_days);



    }
}
