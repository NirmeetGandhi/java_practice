package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class final_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int a[][] = {
//                {1,2,3,4},
//                {5,6,7},
//                {8,9,10,11}
//        };

        int b[][] = new int[3][];
        b[0] = new int[2];
        b[1] = new  int[3];
        b[2] = new int[4];

        for (int i = 0; i <b.length ; i++) {
            for (int j = 0; j <b[i].length ; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int temp[]:b) {
            System.out.println(Arrays.toString(temp));
        }


        //1st way
//        for (int i = 0; i <a.length ; i++) {
//            for (int j = 0; j <a[i].length ; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println( );
//        }

        //2nd way
//        for (int i = 0; i <a.length ; i++) {
//            System.out.println(Arrays.toString(a[i]));
//        }

        //3rd way
//        for (int t[]:b) {
//            System.out.println(Arrays.toString(t));
//        }


    }
}
