package com.codebook;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;
        int Num = input.nextInt();  // 732
        int answer = 0 ;

        while(Num > 0){
           int reminder = Num % 10 ;
           answer = (answer * 10) + reminder ;
           Num /= 10 ;
        }

        System.out.println(answer);
    }
}
