package com.Employeewage;

public class Employeewage {
    // Declaring Constant
    public static final int Is_Full_time = 1;
    public static final int Is_part_time = 2;
    public static final int Emp_wage_per_hr = 20;
    public static final int no_working_days = 20;
    public static final int Max_working_hrs = 100;
    //Defining static method for calculate empwage for company
    public static int ComputeEmpwage (String company, int Emp_wage_per_hr, int no_working_days, int Max_working_hrs) {
// variables

        int Emp_hrs;
        int Salary;
        int total_salary=0;
        int total_wrk_hrs=0;
        int total_wrk_days=0;

        while ( total_wrk_hrs<= Max_working_hrs && total_wrk_days<=no_working_days) {
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
        System.out.println("Total Empwage for " +company +" is " + total_salary);
        System.out.println("Total EmpHrs for " +company +" is " + total_wrk_hrs);
        System.out.println("Total EmpDays for "+company +" is " + total_wrk_days);
        return total_salary;

    }
    public static void main(String[] args) {
        System.out.println("welcome to Employee wage computation program");
        ComputeEmpwage("Reliance", 25, 20, 100);
        ComputeEmpwage("Bridgelab", 20, 24, 150);


    }
}
