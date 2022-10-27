package com.company;

import java.util.Arrays;

public class bubble_selection_rev {
    static void sort(int[]arr){
        boolean swapped;
        for (int i = 0; i <arr.length ; i++) {
            swapped = false;
            for (int j = 1; j <arr.length - i ; j++) {
                if (arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
    static int maxIndex(int[]arr,int st,int en){
        int max = st;
        for (int i = st; i <=en; i++) {
            if (arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void selection(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            int lastIndex = arr.length - i -1;
            int maxIndex = maxIndex(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);

        }
    }
    public static void main(String[] args) {
        int [ ]arr = {5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
