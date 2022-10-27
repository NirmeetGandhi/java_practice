package com.company;

public class binary_search {
    static int binarySearchIn1dArray(int arr[] , int target){
        int len = arr.length;
        int st = 0;
        int en = len-1;
        int key = (st+en)/2;

        if (target==arr[key]){
            return key;
        }
        if (target<arr[key]){
            for (int i = st; i <key ; i++) {
                if (arr[i]==target){
                    return i;
                }
            }
            return -1;
        }

        if (target>arr[key]){
            for (int i = key+1; i <=en ; i++) {
                if (arr[i]==target){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,34,56,78,90,99};
        System.out.println(binarySearchIn1dArray(arr,78));
    }
}
