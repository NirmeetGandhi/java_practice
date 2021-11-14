package com.company;
import java.util.Scanner;

public class nir15_conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age_check = sc.nextInt();
//        int age  = 18;
        if(age_check>18)
        {
            System.out.println("Congratulations!!Your age is " + age_check + " !Now you can drive");
        }
        else if(age_check!=40){
            System.out.println("WOW");
        }
        else{
            System.out.println("Sorry!! You cannot drive because your age is " + age_check);
        }
    }
}
