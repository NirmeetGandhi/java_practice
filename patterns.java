package com.company;

public class patterns {
    static void pattern_no1(int n){
//        *
//        **
//        ***
//        ****

        for (int i = 1; i <=n ; i++) {
            for (int j =1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern_no2(int n){
//    *****
//    *****
//    *****
//    *****
//    *****
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern_no3(int n){
//    *****
//    ****
//    ***
//    **
//    *
        for (int i = n; i <=1 ; i--) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        pattern_no1(10);
//        pattern_no2(5);
        pattern_no3(5);

    }
}
