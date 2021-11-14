package com.company;
import  java.util.Scanner;

public class practice_set5_pr01 {
    public static void main(String[] args) {
//        int  n = 4;
//        for (int i=n;i>0;i--){
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//
        // PRINTS PATTERN
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print the pattern");
        int n = sc.nextInt();
        for (int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
