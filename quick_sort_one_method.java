package com.company;

import java.util.Arrays;

public class quick_sort_one_method {
    static void quickSort(int[]arr,int st,int en){
        if (st<=en){
            int p = partition(arr,st,en);

            quickSort(arr,st,p-1);
            quickSort(arr,p+1,arr.length-1);
        }
    }

    static int partition(int[]arr,int st,int en){
        int pivot = arr[st];

        int count = 0;
        for (int i = st+1; i <=en ; i++) {
            if (arr[i]<pivot){
                count++;
            }
        }
        int pivotIndex = st + count;
        int temp = arr[st];
        arr[st] = arr[pivotIndex];
        arr[pivotIndex] = temp;
//        swap(arr[st],arr[pivotIndex]);
        int i=st;
        int j = en;

        while (i<pivotIndex && j>pivotIndex){
            while (arr[i]<pivot){
                i++;
            }
            while (arr[j]>pivot){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
//                swap(arr[i++],arr[j--]);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    public static void main(String[] args) {
        int [] arr= {99,5,1,2,0,-1,34};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
