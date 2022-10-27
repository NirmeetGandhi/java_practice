package com.company;
import java.util.Scanner;

public class fibonacci {
     static void check(){

        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
        int inp = sc.nextInt();
     int s1=0;
        int s2=1;
     int count = 0;
     int temp = 0;
     while (count<inp){
         if (count==0){
             System.out.println(s1);
         }
         else if(count==1){
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
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int user;
         do {
             System.out.println("Press 1 to enter number to get fibonacci series , 2 to exit");
             user = sc.nextInt();
             switch (user) {
                 case 1:
                     check();

                 case 2:
                     System.out.println("Thank YOu");
             }
         }while (user!=2);
    }
}
