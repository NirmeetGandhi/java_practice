package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class threed_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][][] = {{{1,2,3},{4,5,6}},
                        {{7,8,9},{10,11,12}}
                         };
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                for (int k = 0; k <arr[j].length ; j++) {
                    System.out.print(Arrays.toString(arr[i][j]));
                }
            }
            System.out.println();
        }
    }
}
