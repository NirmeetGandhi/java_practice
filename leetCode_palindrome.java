package com.company;

public class leetCode_palindrome {
    static boolean isPalindrome(int x){
        int r;
        int s = 0;
        int c = x;
        while (x>0){
            r = x%10;
            s =  (s*10)+r;
            x = x/10;
        }
        if (s==c){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(211));
    }
}
