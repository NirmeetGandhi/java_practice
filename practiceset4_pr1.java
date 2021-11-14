package com.company;
import java.util.Scanner;
public class practiceset4_pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number of 1st subject:");
        float marks1 = sc.nextFloat();
        System.out.println("Enter the marks of 2nd subject:");
        float marks2 = sc.nextFloat();
        System.out.println("Enter the marks of 3rd subject:");
        float marks3 = sc.nextFloat();

        float total = (marks1+marks3+marks2)/3.0f;
        if (total>=40 && marks1>33 && marks2>33 && marks3>33){
            System.out.println("congratulations you are pass and your peercentage are " + total);
        }
        else{
            System.out.println("You need improvement you are FAIL becaue your percentage are "+ total);
        }

    }
}
