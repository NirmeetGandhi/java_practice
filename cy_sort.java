package com.company;

import java.util.Arrays;

public class cy_sort {
    static void swap(int[]arr,int a ,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void cycleSort(int[]arr){
        int i =0;
        while (i<arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,6,1,2,3,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
