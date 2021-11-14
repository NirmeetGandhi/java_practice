package com.company;

public class practice_set5_pr07 {
    public static void main(String[] args) {
        int n =4;
        int i = n;
        int j=0;
        while (i<=n && i>0){
            i--;
            while (j<i){
                j++;
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
