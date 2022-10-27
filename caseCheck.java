package com.company;

import java.util.Scanner;

public class caseCheck {
    static void test(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s1 = 0;
        int s2 = 1;
        int temp;
        int count = 0;
         while (count<n){
             if (count == 0){
                 System.out.print(s1 + " ");
             }
             else if (count==1){
                 System.out.print(s2 + " ");
             }
             else if (count>1){
                 temp = s1+s2;
                 s1= s2;
                 s2 = temp;
                 System.out.print(temp + " ");
             }
             count++;
         }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 way to take character as input
//        char s = sc.next().trim().charAt(0);

        // 1 way to take character as input
        test();
//        String str = sc.next();
//        char ch =  str.charAt(0);
//
//
//        if (ch >= 'a' && ch<='z'){
//            System.out.println(ch + " is in lower case");
//        }
//        else if(ch>='A' && ch<='Z'){
//            System.out.println(ch + " is in upper case");
//        }
    }
}
