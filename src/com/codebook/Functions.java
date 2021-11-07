package com.codebook;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
//        int a = 20 ;
//        int b = 30 ;
        int sum = sum(20,50);
        System.out.println("Sum: " + sum);

        //----------------------------------

        String personalized = myGreet(" ,What's upp Boy") ;
        System.out.println(personalized);
    }

    private static String myGreet(String greet) {
        String message = "Hello" + greet ;
        return message ;
    }

    //    public static void sum(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the First Number ");
//        int num1 = input.nextInt();
//        System.out.print("Enter the Second Number ");
//        int num2 = input.nextInt() ;
//        int sum = num2 + num1;
//        System.out.println("Sum:"+ sum);
//
//    }
    public static int sum(int a , int b){
        int sum = a + b ;
//        System.out.println(sum);
        return sum ;
    }

}
