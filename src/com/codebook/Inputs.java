package com.codebook;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Please enter the Roll Number: ");
        int rollNumber = input.nextInt() ;
        System.out.println("Your roll number is " + rollNumber);
    }
}
