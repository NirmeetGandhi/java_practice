package com.company;

import java.util.Scanner;

public class OCCURENCES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number of which you want to find occurrence");
        int ch = sc.nextInt();
        int r;
        int org = n;
        int count = 0;
        while (n>0){
            r = n%10;
            if (r==ch){
                count = count+1;
            }
                n  =n/10;
        }
        System.out.println(ch + " is occuring " + count + " times " + "in " + org);
    }
}
