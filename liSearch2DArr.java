package com.company;

import java.util.Arrays;

public class liSearch2DArr {
    static int[] check(int arr[][] , int target){
        if (arr.length==0){
            return new int[]{};
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }

    static int maxIn2DArray(int arr[][]){
        int max = arr[0][0];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,34,56,7},
                {2,345,67},
                {65,7545,667},
                {23,432,221,3,321,12,3},
                {12,12}
        };

//        System.out.println(Arrays.toString(check(arr,12)));
//        System.out.println(maxIn2DArray(arr));
        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
    }
}
