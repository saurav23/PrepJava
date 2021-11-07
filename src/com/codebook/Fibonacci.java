package com.codebook;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int nth_Fibonacci = input.nextInt() ;
        int first = 0 ;
        int second = 1 ;
        int count = 2 ;

//        if(nth_Fibonacci == 0){
//            System.out.println("Your Nth fibonacci is " + );
//        }
//        if(nth_)
        while (count < nth_Fibonacci){
            int temp = second ;
            second = second + first ;
            first = temp ;
            count++ ;
        }

        System.out.println(second);
    }
}

// 0 1 1 2 3 5 8 13
// 1 2 3 4 5 6 7 8