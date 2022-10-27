package com.company;

public class OrderAgnosticBinarySearchTree {
    static int agnosticBinary(int [] arr,int target){
        int st = 0;
        int en = arr.length-1;

        boolean Asca;
            if (arr[st]<arr[en]){
                Asca = true;
            }
            else {
                Asca = false;
            }

        while (st<=en){
            int mid = st + (en-st)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (Asca){
                if (target<arr[mid]){
                    en = mid-1;
                }
                else {
                    st = mid+1;
                }
            }
            else {
                if (target>arr[mid]){
                    en = mid-1;
                }
                else {
                    st = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,34,56,78,90,99};
        int [] arr1 = {99,90,78,56,34,2,1};

        System.out.println(agnosticBinary(arr,34));
        System.out.println(agnosticBinary(arr1,34));
    }
}
