package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class quickSort_takeUserInput {
    static void quickSort(int[]arr,int st,int en){
        if (st<=en){
            int pivot = partition(arr,st,en);
            quickSort(arr,st,pivot-1);
            quickSort(arr,pivot+1,arr.length-1);
        }
    }

    static int partition(int[]arr,int st,int en){
        int pivot = st;
        int count =0;
        for (int i = st+1; i <=en ; i++) {
            if (arr[i]<arr[pivot]){
                count++;
            }
        }
        int pivotIndex = pivot+ count;
        int temp= arr[pivot];
        arr[pivot] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        int i=st;
        int j=en;

        while (i<pivotIndex && j>pivotIndex){
            while (arr[i]<pivotIndex){
                i++;
            }
            while(arr[j]>pivotIndex){
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
        int [] arr1 = {10,9,8,7,6,5,4,3,2,1,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[]arr2 = new int[size];

        System.out.println("Enter elements");
        for (int i = 0; i <arr2.length ; i++) {
            arr2[i] = sc.nextInt();
        }
        quickSort(arr2,0,arr2.length-1);
        System.out.println(Arrays.toString(arr2));
    }
}
