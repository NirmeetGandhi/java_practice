package com.company;

import java.util.Arrays;

public class bublee {
    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i <arr.length ; i++) {
            swapped = false;
            for (int j = 1; j <arr.length -i ; j++) {
                if (arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (swapped==false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1000,100,0,-300,-200,455,1,10,9};
        System.out.println("Unsorted Array is");
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println();
        System.out.println("Sorted Array is");
        System.out.println("*****************************");
        System.out.println(Arrays.toString(arr));
    }
}
