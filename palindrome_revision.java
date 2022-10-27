package com.company;
import java.util.Scanner;

public class palindrome_revision {
    static void pali_int(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r,c,s=0;
        c=n;
        while (n>0){
            r= n%10;
            s = (s*10)+r;
            n = n/10;
        }
        if (s==c){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }

    static void pali_string(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String org_Str = str;
        String rev_Str = "";
        int len = str.length();
        for (int i = len-1; i >=0 ; i--) {
            rev_Str = rev_Str + str.charAt(i);
        }
        if (rev_Str.equals(org_Str)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
    public static void main(String[] args) {
//        pali_int();
        pali_string();
    }
}
