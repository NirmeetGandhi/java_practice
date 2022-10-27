package com.company;

import java.util.Scanner;

public class fibooo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number untill which You want to print the fibonacci series");
        int inp = sc.nextInt();
        int s1 = 0;
        int s2 = 1;
        int count = 0;
        int temp = 0;

        while (count<inp){
            if (count==0){
                System.out.println(s1);
            }
            else if (count==1){
                System.out.println(s2);
            }
            else if(count>1){
                temp = s1+s2;
                s1=s2;
                s2 = temp;
                System.out.println(temp);
            }
            count++;
        }
    }
}
