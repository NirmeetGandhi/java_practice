package com.company;
import java.util.Locale;
import java.util.Scanner;


public class palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check palindrome");
        long n = sc.nextLong();
        long r,c,s=0;
        c = n;

        while (n>0){
            r = n%10;
            s = (s*10)+r;
            n = n/10;
        }
        if (c==s){
            System.out.println(c+ " is Palindrome");
        }
        else {
            System.out.println(c + " is not Palindrome");
        }


//        String str = "Radar";
//        String reverseStr = "";
//
//        int strLength = str.length();
//
//        for (int i = (strLength - 1); i >=0; --i) {
//            reverseStr = reverseStr + str.charAt(i);
//        }
//
//        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
//            System.out.println(str + " is a Palindrome String.");
//        }
////        if (reverseStr.toLowerCase() == str.toLowerCase()){
////            System.out.println("String is palindrome");
////        }
//        else {
//            System.out.println(str + " is not a Palindrome String.");
//        }

    }

}
