package com.company;

public class max_Arr {
    static int max(int arr[]){
        int maxii = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>maxii){
                maxii = arr[i];
            }
        }
        return maxii;

    }

    static int max_range(int a[],int start,int end){
        int maxiii;
        maxiii = a[start];
        for (int i = start; i <=end ; i++) {
            if (a[i]>maxiii){
                maxiii = a[i];
            }
        }
        return maxiii;
    }
    public static void main(String[] args) {
        int a[] = {233,2,3,4,54};
        System.out.println(max(a));
        System.out.println(max_range(a,1,4));
    }
}
