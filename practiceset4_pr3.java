package com.company;
import java.util.Scanner;

public class practiceset4_pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number between 1 to 7");
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wendesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("please enter a number between 1 to 7");
        }
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case  2:
//                System.out.println("Tuesday");
//                break;
//            default:
//                System.out.println("Hello");
//        }

    }
}
