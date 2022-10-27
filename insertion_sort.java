package com.company;

import java.util.Arrays;

public class insertion_sort {
    static void swap(int[]arr,int a ,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void insertion(int[]arr){
        for (int i = 0; i <arr.length- 1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
                else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
