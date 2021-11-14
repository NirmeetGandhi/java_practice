package com.company;

public class practice_set7_pr03_recursive {
    static int sum(int n){
        if (n==1){
            return 1;
        }
        else {
            return n + sum(n - 1);
        }
    }
    public static void main(String[] args) {
        int c = sum(2);
        System.out.println(c);
    }
}
