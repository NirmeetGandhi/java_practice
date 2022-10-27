package com.company;
import java.lang.System;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;


public class rev_ragged_arr {
    static void occurrence(char target){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        int len = str.length();

        for (int i = len-1; i >=0 ; i--) {
            if (target==str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean FindCharInString(char target){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char [] ch = str.toCharArray();
        int count =0;
        for (char chs:ch) {
            if (chs==target){
//                count++;
                return true;
            }
//            System.out.println(count);
        }
        return false;
    }
    static boolean armstrong(int n){
        int sum= 0;
        int org = n;
        int cub = 1;
        int r = 0;
        while (n>0){
            r = n%10;
            cub = r*r*r;
            sum = sum +cub;
            n = n/10;
        }
        if (sum==org){
            return true;
        }
        return false;
    }
    static void printArmstrong(){
        for (int i = 100; i <1000 ; i++) {
            if (armstrong(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
//        int [][] arr = new int[3][];
//        arr[0] = new int[1];
//        arr[1] = new int[2];
//        arr[2] = new int[3];

//        int [][] arr1 = new int[2][3];
//        arr1[0][0] = 1;
//        arr1[0][1] = 1;
//        arr1[0][2] = 1;
//
//        arr1[1][0] = 1;
//        arr1[1][1] = 1;
//        arr1[1][2] = 1;



        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                arr[i][j] = sc.nextInt();
//            }
////        }
//        for (int i = 0; i <arr1.length ; i++) {
//            for (int j = 0; j <arr1[i].length ; j++) {
//                System.out.print(arr1[i][j]+ " ");
//            }
//            System.out.println();
//        }
//        System.out.println();

//        for (int i = 0; i <arr.length ; i++) {
//            System.out.println(Arrays.toString(arr[i])+ " ");
//        }
//        for (int [] a:arr) {
//            System.out.println(Arrays.toString(a));
//        }
//        int [] arr= {1,2,3,4,323,323,3232,323,42};
//        int sum =0;
//        int count = 0;
//
//        for (int i = 0; i <arr.length ; i++) {
//            sum = sum + arr[i];
//            count++;
//        }
//        int ans = sum/count;
//        System.out.println(ans);
//        occurrence('a');
//        System.out.println(FindCharInString('e'));
        System.out.println(armstrong(153));
        printArmstrong();


    }
}
