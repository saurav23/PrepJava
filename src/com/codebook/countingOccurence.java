package com.codebook;

import java.util.Scanner;

public class countingOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)  ;
        int num = input.nextInt();

        int numtocheck = input.nextInt() ;

        int count = 0 ;

        while(num > 1){
            if(num%10 == numtocheck){
                count++ ;
            }
            num = num/10 ;
        }

        System.out.println(count);
    }
}
