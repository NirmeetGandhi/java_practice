package com.company;
import java.util.Scanner;

public class temp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
//        System.out.println("Enter the no to find occurrence");
//        int ch = sc.nextInt();
//        int r;
//        int count = 0;
//        while (n>0){
//            r = n%10;
//
//            if (r==ch){
//                count++;
//            }
//            n = n/10;
//        }
//        System.out.println(count);

        int fact = 1;
        while (n>0){
            fact = fact * n;
            n = n-1;
        }
        System.out.println(fact);
    }


}
