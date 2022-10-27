package com.company;

public class pattern {
    public static void pattern1(int n){
        for (int i=0;i<=n-1;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for (int i=0;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        pattern1(7);
        pattern2(7);

    }
}
