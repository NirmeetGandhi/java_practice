package com.company;

import java.util.Arrays;

public class quickkkk {
    static void swap(int[]arr,int a ,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
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
        for (int i = st+1; i <=en ; i++) {
            if (arr[i]<pivot){
                count++;
            }
        }
        int pivotIndex = st + count;
        swap(arr,st,pivotIndex);

        int i = st;
        int j=en;

        while (i<pivotIndex && j>pivotIndex){
            while (arr[i]<arr[pivotIndex]){
                i++;
            }
            while (arr[j]>pivotIndex){
                j--;
            }
            if (i<pivotIndex && j>pivotIndex){
                swap(arr,i++,j--);
            }
        }
        return pivotIndex;
    }
    public static void main(String[] args) {
        int [] arr= {5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
