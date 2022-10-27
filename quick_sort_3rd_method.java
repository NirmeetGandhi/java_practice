package com.company;

import java.util.Arrays;

public class quick_sort_3rd_method {
    static void quickSort(int[]arr,int st,int en){
        if(st<=en){
         int p = partition(arr,st,en);
         quickSort(arr,st,p-1);
         quickSort(arr,p+1,arr.length-1);
        }
    }
    static int partition(int[]arr,int st,int en){
        int pivot = arr[st];
        int count =0;
        for (int i = st; i <=en ; i++) {
            if (arr[i]<pivot){
                count++;
            }
        }
        int pivotIndex = st + count;
        int temp = arr[st];
        arr[st]=arr[pivotIndex];
        arr[pivotIndex]=temp;

        int i=st;
        int j=en;

        while (i<pivotIndex&&j>pivotIndex){
            while (arr[i]<arr[pivotIndex]){
                i++;
            }
            while (arr[j]>arr[pivotIndex]){
                j--;
            }
            if (i<pivotIndex&&j>pivotIndex){
                int temp1 = arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;
            }
        }
        return pivotIndex;
    }
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
