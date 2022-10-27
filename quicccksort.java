package com.company;

import java.util.Arrays;

public class quicccksort {
    static void quickSorttt(int[]arr,int st,int en){
        if (st<=en){
            int pivot = partitionnn(arr,st,en);
            quickSorttt(arr,st,pivot-1);
            quickSorttt(arr,pivot+1,arr.length-1);
        }
    }
    static int partitionnn(int[]arr,int st,int en){
        int pivot = st;
        int count=0;
        for (int i = st+1; i <=en ; i++) {
            if (arr[i]<arr[pivot]){
                count++;
            }
        }
        int pivotIndex = pivot + count;
        int temp = arr[pivot];
        arr[pivot]=arr[pivotIndex];
        arr[pivotIndex]=temp;

        int i=st;
        int j=en;

        while (i<pivotIndex && j>pivotIndex){
            while (arr[i]<pivotIndex){
                i++;
            }
            while (arr[j]>pivotIndex){
                j--;
            }
            if (i<pivotIndex&&j>pivotIndex){
                int temp1 = arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;
//                i++;
//                j--;
            }
        }
        return pivotIndex;
    }
    public static void main(String[] args) {
        int[]arr = {5,4,3,2,1};
        quickSorttt(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
