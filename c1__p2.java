package com.company;
import java.util.Scanner;

public class c1__p2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in kms to convert in Kms");
    float km = sc.nextFloat();
    float miles  = km*0.621371f;
        System.out.println("The value entered in km is: " + km);
        System.out.println("The value in miles is: " + miles);
    }
}
