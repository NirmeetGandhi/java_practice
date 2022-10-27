package com.company;

public class minAndMaxInArray {
    static int min(int arr[]){

        if (arr.length==0){
            System.out.println("Empty Array");
        }

        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<=min){
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int arr[]){

        if (arr.length==0){
            System.out.println("Empty Array");
        }

        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>=max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {23,456,67878,12};
        System.out.println("Minimum element is: "+ min(arr));
        System.out.println("Maximum element is: "+ max(arr));
    }
}
