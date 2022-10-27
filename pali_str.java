package com.company;

import java.util.Scanner;

public class pali_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u1;
        do {
            System.out.println("Enter 1 to Enter new String , 2 to Exit");
            u1 = sc.nextInt();
            switch (u1) {
                case 1:
                    System.out.println("Enter the string");
                    System.out.println("NOTE:Please enter all the characters either in small or full capital");
                    String str = sc.next();
                    String org_str = str;
                    String rev_str = "";
                    int len = str.length();
                    for (int i = len - 1; i >= 0; i--) {
                        rev_str = rev_str + str.charAt(i);
                    }
//        System.out.println(rev_str);
                    if (org_str.equals(rev_str)) {
                        System.out.println(org_str + " is Palindrome");
                        System.out.println();
                    }
                    else {
                        System.out.println(org_str + " is not Palindrome");
                        System.out.println();
                    }
                case 2:
                    System.out.println("Thank you");
            }
//        System.out.println("Enter the string");
//        String str = sc.next();
//        String org_str= str;
//        String rev_str = "";
//        int len = str.length();
//        for (int i=len-1;i>=0;i--){
//            rev_str = rev_str+str.charAt(i);
//        }
////        System.out.println(rev_str);
//        if (org_str.equals(rev_str)){
//            System.out.println(org_str+" is Palindrome");
//        }
//        else {
//            System.out.println(org_str+" is not Palindrome");
//         }
        }while (u1!=2);
    }
}
