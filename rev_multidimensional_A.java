package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class rev_multidimensional_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a ;
        a = new int[2][];

        a[0] = new int[3];
        a[1] = new int[2];

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int[] e:a) {
            System.out.println(Arrays.toString(e));
        }
//        for (int i = 0; i <a.length ; i++) {
//            System.out.println(Arrays.toString(a[i]));
//        }
//        for (int i = 0; i <a.length ; i++) {
//            for (int j = 0; j <a[i].length ; j++) {
//                System.out.print(a[i][j]+  " ");
//            }
//            System.out.println();
//        }
    }
}
