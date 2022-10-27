package com.company;

import java.util.Scanner;

public class palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        String org_str;
        String rev_str = "";
        org_str=str;
        int len = str.length();

        for (int i=len-1;i>=0;i--){
            rev_str = rev_str + str.charAt(i);
        }
        if (org_str.equals(rev_str)){
            System.out.println("Plaindrome");
        }
        else{
            System.out.println("Not plaindrome");
        }
    }
}
