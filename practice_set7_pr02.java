package com.company;

public class practice_set7_pr02 {
    // functional approach
    static void pattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {

        // iterative approach
//        int  n =7;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        pattern(6);
    }
}
