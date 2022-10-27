package com.company;

public class palindrome_check_using_recursion {
    static int setUp(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return ans(n,digits);
    }
    static int ans(int n,int digits){
        if (n%10==0){
            return n;
        }
        int r = n %10;
        return r*(int)(Math.pow(10,digits-1)) + ans(n/10 , digits-1);
    }
    static boolean paliCheck(int n){
        if (n==setUp(n)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(paliCheck(121));
    }
}
