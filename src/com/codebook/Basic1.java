package com.codebook;

import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {
        System.out.println("Enter the Salary: ");
        Scanner input = new Scanner(System.in) ;
        int salary = input.nextInt() ;

        // Test case
        if (salary > 10000){
            salary = salary + 2000 ;
        }
        else {
            salary = salary + 1000 ;
        }

        System.out.println("New Salary is " + salary);
    }
}
