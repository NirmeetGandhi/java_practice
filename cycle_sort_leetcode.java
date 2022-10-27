package com.company;

import java.util.Arrays;

public class cycle_sort_leetcode {
    static void swap(int[]arr,int a ,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static int  cycleSort(int[]arr){
        int i=0;
        while (i<arr.length){
            int correctIndex = arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j <arr.length ; j++) {
            if (arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
    public static void main(String[]args){
        int []arr = {0,1,2,4};

        System.out.println(cycleSort(arr));
//        System.out.println(Arrays.toString(arr));
    }
}
