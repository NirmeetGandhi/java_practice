package com.company;

public class binary {
    static int bs(int arr[] , int target){
        int st = 0;
        int en = (arr.length) -1;
        int key = st + (en-st)/2;

        if (target == arr[key]){
            return key;
        }
        if (target<arr[key]){
            en = key-1;
            for (int i = st; i <=en ; i++) {
                if (arr[i]==target){
                    return i;
                }
            }
        }
        if (target>arr[key]){
            st = key +1;
            for (int i = st; i <=en ; i++) {
                if (arr[i]==target){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,34,56,78,90,99};
        System.out.println(bs(arr,56));
    }
}
