package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class super_rev {
    static void int_palindrome_check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int r, c, s = 0;
        c = n;
        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }
        if (s==c){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }

    static void peli_str_rev(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String org_Str = str;
        String rev_Str = "";
        int len = str.length();
        for (int i = len-1; i >=0 ; i--) {
            rev_Str = rev_Str + str.charAt(i);
        }
        if (rev_Str.equals(org_Str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }

    static void fib_rev(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get fibonacci series");
        int n = sc.nextInt();
        int count=0;
        int temp;
        int s1=0;
        int s2 = 1;

        while (count<n){
            if (count==0){
                System.out.print(s1);
            }
            else if (count==1){
                System.out.print(s2);
            }
            else if(count>1){
                temp = s1+s2;
                s1 = s2;
                s2 = temp;
                System.out.print(temp);
            }
            count++;
        }
    }
    static void oned_Arr(){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = {3,4,5,6,7};
        int c[];
        c = new int[5];
        c[0] = 1;
        c[1] = 2;
        c[2] = 3;
        c[3] = 4;
        c[4] = 5;
//        for (int i = 0; i <a.length ; i++) {
//            a[i] = sc.nextInt();
//        }
        for (int e:c) {
            System.out.print(e + " ");
        }
        System.out.println(Arrays.toString(c));

    }

    static void twod_Arr(){
        Scanner sc = new Scanner(System.in);
        int a[][] = {
                {1,2,3,4},
                {5,6,7,8}
        };

        int b[][] = new int[4][];
        b[0] = new int[1];
        b[1] = new int[2];
        b[2] = new int[3];
        b[3] = new int[4];

        int c[][] = new int[2][3];
        c[0][0] = 1;
        c[0][1] = 2;
        c[0][2] = 3;
        c[1][0] = 4;
        c[1][1] = 5;
        c[1][2] = 6;

//        for (int i = 0; i <c.length ; i++) {
//            System.out.println(Arrays.toString(c[i]));
//        }

        for (int e[]:c) {
            System.out.print(Arrays.toString(e));
        }


//        for (int i = 0; i <a.length ; i++) {
//            for (int j = 0; j <a[i].length ; j++) {
//                System.out.print(a[i][j]+ " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i <b.length ; i++) {
//            for (int j = 0; j <b[i].length ; j++) {
//                b[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i <b.length ; i++) {
//            for (int j = 0; j <b[i].length ; j++) {
//                System.out.print(b[i][j]+ " ");
//            }
//            System.out.println();
//        }
    }
    static void singDAL_rev(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <4 ; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
    static void mulDAL(){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                list.add(new ArrayList<>());
            }
        }

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }

    static int maxInArray(int [] arr){
        int maxii = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            while (arr[i]>maxii){
                maxii = arr[i];
            }
        }
        return maxii;
    }

    static void swap(int a[] , int start , int end){
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;

        System.out.println(Arrays.toString(a));

    }
    static int maxRange(int []a,int start,int end){
        int maxiii = a[start];
        for (int i = start; i <=end ; i++) {
            while (a[i]>maxiii){
                maxiii = a[i];
            }
        }
        return maxiii;
    }

    public static void main(String[] args) {
//        int_palindrome_check();
//        peli_str_rev();
//        fib_rev();
//        oned_Arr();
//        twod_Arr();
//        singDAL_rev();
//        mulDAL();
        int a[] = {4,5,6,45,7,8,8,778};
//        System.out.println(maxInArray(a));
//        swap(a,2,3);
        System.out.println(maxRange(a,0,7));
    }
}

