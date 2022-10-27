package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class super_rev_vno_12 {
    static void int_pali(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int r;
        int s =0;
        int c;
        c = n;

        while (n>0){
            r = n%10;
            s = (s*10) + r;
            n = n/10;
        }
        if (c==s){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not plaindrome");
        }
    }

    static void String_pali(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev_str = "";
        String org_Str;
        org_Str = str;
        int len = str.length();

        for (int i = len-1; i >=0 ; i--) {
            rev_str = rev_str + str.charAt(i);
        }
        if (rev_str.equals(org_Str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }

    static void fib(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int count = 0;
        int s1 = 0;
        int s2 = 1;
        int temp;

        while (count<number){
            if (count==0){
                System.out.print(s1 + " ");
            }
            else if (count==1){
                System.out.print(s2 + " ");
            }
            else if(count>1){
                temp = s1+s2;
                s1 = s2;
                s2 = temp;
                System.out.print(temp + " ");
            }
            count++;
        }
    }
    static void oned_Arr(){
        Scanner sc = new Scanner(System.in);
//        int a[];
//        a = new int[4];
//
//        for (int i = 0; i <a.length ; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.print(Arrays.toString(a));
//        System.out.println("Please declare the size of an array");
//        int user = sc.nextInt();
//        int b[] = new int[user];
//        for (int i = 0; i <b.length ; i++) {
//            b[i] = sc.nextInt();
//        }
//        for (int i = 0; i <b.length ; i++) {
//            System.out.print(b[i] + " ");
//        }

        int c[] = {1,2,3,4};
        for (int e:c) {
            System.out.print(e + " ");
        }
    }

    static void twod_Arr(){
        Scanner sc = new Scanner(System.in);
//        int a[][];
//        a = new int[4][];
//        a[0] = new int[1];
//        a[1] = new int[2];
//        a[2] = new int[3];
//        a[3] = new int[4];
//
//        for (int i = 0; i <a.length ; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i <a.length ; i++) {
//            for (int j = 0; j <a[i].length ; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }

//        int b[][] = new int[4][3];
//
//        for (int i = 0; i <b.length ; i++) {
//            for (int j = 0; j <b[i].length ; j++) {
//                b[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i <b.length ; i++) {
//            System.out.println(Arrays.toString(b[i]) + " ");
//        }

//        for (int i = 0; i <b.length ; i++) {
//            for (int j = 0; j <b[i].length ; j++) {
//                System.out.print(b[i][j] + " ");
//            }
//            System.out.println();
//        }

        String c[][] = {
                {"*"},
                {"*","*"},
                {"*","*","*"},
                {"*","*","*","*",}
        };

//        for (int i = 0; i <c.length ; i++) {
//            for (int j = 0; j <c[i].length ; j++) {
//                System.out.print(c[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (String e[]:c) {
            System.out.println(Arrays.toString(e));
        }
    }

    static void onedAL(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
    static void twodAL(){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
                list.add(new ArrayList<>());
        }
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <4 ; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }

    static void swap(int a[] , int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        System.out.println("New:");
        System.out.print(Arrays.toString(a) + " ");
    }

    static int max(int a[]){
        int max = a[0];

        for (int i = 0; i <a.length ; i++) {
            while (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    static int maxRange(int arr[] , int st , int en){
        int max = arr[st];
        for (int i = st; i <=en ; i++) {
            while (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static void occurrences(){
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the occurrences number");
        int ch = sc.nextInt();
        int count = 0;
        int r;
        int s=0;
         while (n>0){
             r = n%10;
             if (r==ch){
                 count++;
             }
             n = n/10;
         }
        System.out.println(count);
    }
    static void reverse(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int s = 0;
        while (n>0){
            r = n%10;
            s = (s*10)+r;
            n = n/10;
        }
        System.out.println(s);
    }

    static void swapped(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("NEW A AND B ARE");
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
//        int_pali();
//        String_pali();
//        fib();
//        oned_Arr();
//        twod_Arr();
//        onedAL();
//        twodAL();
        int arr[]  = {1,22,3,4,5,6,7};
//        System.out.println("old:");
//        System.out.print(Arrays.toString(arr) + " ");
//        swap(arr,2,3);
//        System.out.println(max(arr));
//        System.out.println(maxRange(arr,2,6));
//        occurrences();
//        reverse();
        int num1 = 10;
        int num2 = 20;
        System.out.println("OLD:");
        System.out.println(num1);
        System.out.println(num2);
        swapped(num1,num2);
    }
}
