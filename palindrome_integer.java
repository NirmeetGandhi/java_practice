package com.company;

import java.util.Scanner;

public class palindrome_integer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int r,c,s=0;
        c=n;

        while (n>0){
            r = n%10;
            s = (s*10)+r;
            n = n/10;
        }
        if (s==c){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not plaindrome");
        }

    }
}
