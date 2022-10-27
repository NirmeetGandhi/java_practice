package com.company;

import java.util.Arrays;

public class SetMismatch {
    static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static int[] ans(int[]arr){
        int i=0;
        while (i<arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i]<arr.length && arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                return new int[]{arr[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,4};
        System.out.println(Arrays.toString(ans(arr)));
    }
}
