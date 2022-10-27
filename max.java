package com.company;

public class max {
    static int max_Range(int arr[] , int start ,int end){
        if (start>end){
            return -1;
        }

        int max= arr[start];
        for (int i=start;i<=end;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;

    }

    static int maximum(int arr[]){
        if (arr.length==0){
            return -1;
        }
        if (arr==null){
            return -1;
        }
        int max= arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[] = {1,900,3,4,5,545,65};
        System.out.println(maximum(a));
        System.out.println(max_Range(a,2,5));
    }

}
