package com.company;
import java.util.Scanner;

public class practice_set5_pr03 {
    public static void main(String[] args) {
//        int n = 5;
//        for (int i=1;i<=10;i++){
//            System.out.println(n+"x"+i+"="+n*i);
//
//        }
//        System.out.println("Enter a number to get the table of:");

        // PRINTS MULTIPLICATION TABLE OF ANY NUMBER ENTERED BY USER
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get the table of:");
        int n = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
    }
}
