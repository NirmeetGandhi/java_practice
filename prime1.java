package com.company;

import java.util.Scanner;

public class prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 st number");
        int st = sc.nextInt();
        System.out.println("Enter 2nd number");
        int en = sc.nextInt();

        for (int i=st;i<=en;i++)
            {
                for (int j=2;j<=st;j++) {
                    if (i % j == 0)
                        break;
                   if ((i%j!=0)){
                       System.out.println(i);
                   }
                }

            }
         }
    }
