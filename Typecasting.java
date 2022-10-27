package com.company;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Here we have declared the variable in float but we are giving it the value as Integer but still it is giving no error and it is typecasting automatically

        float f = 34;
        float f1 = sc.nextInt();
        int a = (int) (67.56f);

        int i  =1234;
        double d = 0.1234;
        float f2 = 5.65f;
        char c = 'a';
        long l = 122334l;
        short s  = 1024;
        byte b= 45;

        double result  = (f2*b) + (i/c) - (d*s);
        System.out.println(result);

    }
}

