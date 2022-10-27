package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mid_practice_some_programs {
//    Scanner sc = new Scanner(System.in);
    static void Array(){
        Scanner sc = new Scanner(System.in);
        int [] arr;
        arr = new int[3];

        int [] arr2 = new int[3];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void twod_Arr(){
        Scanner sc = new Scanner(System.in);
//        int [][] arr = new int[3][3];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//
//        arr[2][0] = 7;
//        arr[2][1] = 8;
//        arr[2][2] =9;
//
//
//        int[][] arr2 = new int[2][3];
//        arr2[0][0] =1 ;
//        arr2[0][1] = 2;
//        arr2[0][2] = 3;
//
//        arr2[1][0] = 4;
//        arr2[1][1] = 5;
//        arr2[1][2] = 6;
//
//        for (int i = 0; i <arr2.length ; i++) {
//            System.out.println(Arrays.toString(arr2[i]));
//        }

//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        int [][] reg = new int[3][];
        reg[0] = new int[1];
        reg[1] = new int[2];
        reg[2] = new int[3];
        for (int i = 0; i <reg.length ; i++) {
            for (int j = 0; j <reg[i].length ; j++) {
                reg[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <reg.length ; i++) {
            for (int j = 0; j <reg[i].length ; j++) {
                System.out.print(reg[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void palindrome_int(int n){
        int r= 0;
        int ans = n;
        int temp = 0;
        while (n>0){
            r = n %10;
            temp = (temp*10)+r;
            n = n/10;
        }
        if (temp==ans){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NOt");
        }
    }

    static void String_pal(String str){
        String org_Str = str;
        String rev_Str = "";
        int len = str.length();

        for (int i = len-1; i >=0 ; i--) {
            rev_Str = rev_Str + str.charAt(i);
        }
        if (rev_Str.equals(org_Str)){
            System.out.println("P");
        }
        else {
            System.out.println("NP");
        }
    }
    static void reverse_num(int n){
        int r = 0;
        int s = 0;
        while (n>0){
            r=  n %10;
            s = (s*10)+r;
            n = n/10;
        }
        System.out.println(s);
    }

    static void fib(int n){
        int s1 = 0;
        int s2  = 1;
        int count = 0;
        int temp;
        while (count< n){
            if (count==0){
                System.out.print(s1);
            }
            if (count==1){
                System.out.print(s2);
            }
            if (count >1){
                temp = s1 + s2;
                s1 = s2;
                s2 = temp;
                System.out.print(temp);
            }
            count++;
        }
    }
    static void AList(){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        for (int i = 0; i <4 ; i++) {
                ls.add(new ArrayList<>());
        }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <3 ; j++) {
                ls.get(i).add(sc.nextInt());
            }
        }

        System.out.println(ls);
    }
    public static void main(String[] args) {
//        Array();
//        twod_Arr();
//        palindrome_int(121);
//        String_pal("ninew");
//        reverse_num(1234);
//        fib(5);
        AList();
    }
}
