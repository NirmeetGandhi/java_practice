package com.company;

import java.util.ArrayList;

public class factors {
    //TC = O(n)
    static ArrayList<Integer> factor(int n){
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                ls.add(i);
            }
        }
        return ls;
    }
    //TC = O(sqrt(n))
    static void factor2(int n){
        for (int i = 1; i <Math.sqrt(n) ; i++) {
            if (n%i==0){
                if (n/i==i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " "  + n/i + " ");
                }
            }
        }
    }
    static void factor2Sorted(int n){
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i==0){
                if (n/i==i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " ");
                    ls.add(n/i);
                }
            }
        }
        for (int i = ls.size()-1; i >= 0 ; i--) {
            System.out.print(ls.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println(factor(36));
        factor2(36);
        System.out.println();
        factor2Sorted(36);
    }
}
