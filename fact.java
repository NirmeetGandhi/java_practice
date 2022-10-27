package com.company;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get factorial");
        int inp = sc.nextInt();
        int fact = 1;
        while (inp>0){
            fact = fact*inp;
            inp = inp-1;
        }
        System.out.println(fact);
    }
}
