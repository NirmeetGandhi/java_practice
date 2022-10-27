package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class super_rev_rev {
    static void pali_int(){
        Scanner sc = new Scanner(System.in);
        int inp;
        do {
            System.out.println("Press 1 to Enter the number , 2 to Exit");
            inp = sc.nextInt();
            switch (inp){
                case 1:
                System.out.println("Enter thr number: ");
                int user = sc.nextInt();
                int r = 0;
                int s = 0, c;
                c = user;
                while (user > 0) {
                    r = user % 10;
                    s = (s * 10) + r;
                    user = user / 10;

                }
                if (c == s) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not palindrome");
                }
                case 2:
                    System.out.println("Thank you");
            }
        }while (inp!=2);
    }
    static void peli_str(){

        Scanner sc = new Scanner(System.in);
        int user;

        do {
            System.out.println("Press 1 to Enter the String , 2 to exit");
            user = sc.nextInt();

            switch (user){
                case  1:
                    System.out.println("Enter the String: ");
                    String str = sc.next();
                    String org_Str;
                    String rev_Str = "";
                    org_Str = str;
                    int len = str.length();

                    for (int i = len - 1; i >= 0; i--) {
                        rev_Str = rev_Str + str.charAt(i);

                    }
                    if (rev_Str.equals(org_Str)) {
                        System.out.println("Palindrome");
                    } else {
                        System.out.println("Not palindrome");
                    }
                case 2:
                    System.out.println("Thank you");
                    System.out.println();
                case 3:
                    if (user>=3){
                        System.out.println("Please enter either 1 or 2");
                    }
            }
        }while (user!=2);
    }

    static void fibbb(){
        Scanner sc = new Scanner(System.in);
        int user;

        do {
            System.out.println("Press 1 to Enter number , 2 to exit");
            user = sc.nextInt();

            switch (user){
                case 1:
                    System.out.println("Enter the number");
                    int n = sc.nextInt();
                    int count = 0;
                    int temp;
                    int s1 = 0;
                    int s2 = 1;

                    while (count < n) {
                        if (count == 0) {
                            System.out.print(s1 + " ");
                        } else if (count == 1) {
                            System.out.print(s2+ " ");
                        } else if (count > 1) {
                            temp = s1 + s2;
                            s1 = s2;
                            s2 = temp;
                            System.out.print(temp + " ");
                        }
                        count++;
                    }
                case 2:
                    System.out.println();
                    System.out.println("Thanksssss");
            }
        }while (user!=2);

    }

    static void oneed_Array(){
        Scanner sc = new Scanner(System.in);
        int a[]  =  {1,2,3,4,5};
        int b[];
        b = new int[4];
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        b[3] = 4;
        int c[] = new int[4];

//        for (int i = 0; i <a.length ; i++) {
//            System.out.print(a[i] + " ");
//        }
//
//        for (int e:b) {
//            System.out.print(e + " ");
//        }
        for (int i = 0; i <c.length ; i++) {
            c[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(c));
    }

    static void twod_Arr(){
        Scanner sc = new Scanner(System.in);
//        int a[][] ;
//        a = new int[3][];
//        a[0] = new int[2];
//        a[1] = new int[3];
//        a[2] = new int[4];
//
//
//        for (int i = 0; i <a.length ; i++) {
//            for (int j = 0; j <a[i].length ; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int e[]:a) {
//            System.out.println(Arrays.toString(e));
//        }

        int b[][] = new int[3][];
        b[0] = new int[1];
        b[1] = new int[2];
        b[2] = new int[3];

        for (int i = 0; i <b.length ; i++) {
            for (int j = 0; j <b[i].length ; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <b.length ; i++) {
            System.out.println(Arrays.toString(b[i]));
        }


        char c[][] = {
                {'N'},
                {'I','R'},
                {'M','I','T'}
        };
        for (int i = 0; i <c.length ; i++) {
            for (int j = 0; j <c[i].length ; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void singleDAL(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }

    static void multiDAL(){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <5 ; j++) {
                list.add(new ArrayList<>());
            }
        }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <5 ; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }

    static int maxOfAnArray(int a[]){
        int max = a[0];
        for (int i = 0; i <a.length ; i++) {
            while (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    static int maxInRange(int [] a , int start ,int end){
        int max1234 = a[start];
        for (int i = start; i <=end ; i++) {
            while (a[i]>max1234){
                max1234 = a[i];
            }
        }
        return max1234;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        pali_int();
//        peli_str();
//        fibbb();
//        oneed_Array();
//        twod_Arr();
//        singleDAL();
//        multiDAL();
        int arr[] = {1,2,3,4,5,42};
//        maxOfAnArray(arr);
        maxInRange(arr,2,5);
    }

}
