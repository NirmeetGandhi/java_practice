package com.company;

public class practice_set7_pr04 {
    //functional approach
    static void pattern(int n){
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
//        iterative approach
//        int n=4;
//        for (int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
        pattern(4);
        }
    }

