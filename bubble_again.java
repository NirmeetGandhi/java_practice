package com.company;

import java.util.Arrays;

public class bubble_again {
    static void bubble(int[]arr){
        boolean swapped;
        for (int i = 0; i <arr.length ; i++) {
            swapped = false;
            for (int j = 1; j <arr.length -i ; j++) {
                if (arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]= temp;
                    swapped = true;
                }
            }
            if (swapped==false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr= {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
