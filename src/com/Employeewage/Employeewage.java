package com.Employeewage;

public class Employeewage {
    public static void main(String[] args) {
        System.out.println("welcome to Employee wage computation program");
        int Is_Full_time = 1;
        double empcheck = Math.floor(Math.random()*10) % 2;
//        System.out.println(empcheck);
        if (empcheck == Is_Full_time)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Abscent");

    }
}
