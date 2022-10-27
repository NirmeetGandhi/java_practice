package com.company;

import java.util.Arrays;

public class bubbble {
    static void swap(int[]arr,int a ,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void bubble(int[]arr){
        boolean swapped;
        for (int i = 0; i <arr.length ; i++) {
            swapped = false;
            for (int j = 1; j <arr.length-i ; j++) {
                if (arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
