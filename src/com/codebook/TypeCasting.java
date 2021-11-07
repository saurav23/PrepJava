package com.codebook;

public class TypeCasting {
    public static void main(String[] args) {
//        int a = 10 ;
//        float b = 30 ;
//        System.out.println(a+b);

        //Type Casting, also called narrowing down

        int num = (int)(4567.98f) ;
        System.out.println(num);

        //automatic type convesion in expression
        int num1 = 258 ;
        byte b = (byte)(num1) ; // 258 % 256 = 2
        System.out.println(b);
    }
}
