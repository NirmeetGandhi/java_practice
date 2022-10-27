package com.company;

import java.util.Arrays;

public class linearSearchIn2DArray {

    //This method just checks that element is present in Array or not and according to that returns true/false
    static boolean search2d(int arr[][],int target){
        if (arr.length==0){
            return false;
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    //This method gives the index no of the element if it is present in array
    static int[] search2dd(int arr[][],int target){
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
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,34,56,7},
                {2,345,67},
                {65,7545,667},
                {23,432,221,3,321,12,3},
                {12,12}
        };
//        System.out.println(search2d(arr,2));
        System.out.println(Arrays.toString(search2dd(arr,10000)));
    }
}
