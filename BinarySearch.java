package com.company;

public class BinarySearch {
    static int binarySearch(int[] arr, int target) {
        int middle = arr.length;
        int st = 0;
        int en = (middle - 1);
        int key = (st + en) / 2;

        System.out.println(arr[st]);
        System.out.println(arr[key]);
        System.out.println(arr[en]);

        if (target == arr[key]){
            return key;
        }

        if (target < arr[key]) {
            for (int i = 0; i < key; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
        }
        if (target > arr[key]) {
            for (int i = key; i <= en; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }
    public static void main (String[]args){
        int arr[] = {1,2,34,56,78,90,99};
        System.out.println(binarySearch(arr,2));
    }
}
