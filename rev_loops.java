package com.company;
import java.util.Scanner;

public class rev_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Program to reverse the number entered by the user
//        System.out.println("Enter the number: ");
//        int n  = sc.nextInt();
//        int s = 0;
//        int r;
//
//        while (n>0){
//            r = n%10;
//            s = (s*10) + r;
//            n = n/10;
//        }
//        System.out.println(s);
//
        //Program that will tell the occurrences of a particular number in given number
//         int n  =sc.nextInt();
//         int r;
//         int ch = sc.nextInt();
//        int count = 0;
//         while (n>0){
//             r = n%10;
//             if (r==ch){
//                 count++;
//             }
//             n = n/10;
//         }
//        System.out.println(count);

           //Program to find weather the character inserted by the user is in upper or lower case
            char ch = sc.next().trim().charAt(0);
            if (ch >= 'a' && ch<='z'){
                System.out.println("Lower case");
            }
            else {
                System.out.println("UpperCase");
            }


    }
}
