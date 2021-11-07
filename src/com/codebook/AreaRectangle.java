package com.codebook;

import java.util.Scanner;

public class AreaRectangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        float length = input.nextFloat() ;
        float breadth = input.nextFloat() ;
        float area = length * breadth ;

        System.out.println(area);
    }
}
