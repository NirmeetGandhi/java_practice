package com.company;
import java.util.Scanner;

public class practiceset4_pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check if the year is leap year or not");
        int year = sc.nextInt();
//        if (year/4==0){
//            System.out.println("The year is a leap year");
//        }
//        else if(year/100==0){
//            System.out.println("The year is a leap year");
//        }
//        else if(year/400==0){
//            System.out.println("The year is a leap year");
//        }
//        else{
//            System.out.println("the year is not leap year");
//        }
        if(year%4==0){
            System.out.println("Year is leap");
        }
        else {
            System.out.println("Year is not leap year");
        }
    }
}
