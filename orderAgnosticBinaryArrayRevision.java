package com.company;

public class orderAgnosticBinaryArrayRevision {
    static int ascendingOrder(int [] arr , int target){
        int st  =0;
        int en = arr.length -1;

        int mid = st + (en-st)/2;

        if (target<arr[mid]){
            en = mid-1;
        }
        else if(target>arr[mid]){
            st = mid +1;
        }
        else {
            return mid;
        }
        return -1;
    }
    static void descending(int [] arr , int target){
        int st  =0;
        int en = arr.length -1;

        int mid = st + (en-st)/2;

        if (target>arr[mid]){
            en = mid-1;
        }
        else if(target<arr[mid]){
            st = mid +1;
        }
        else {
            System.out.println(mid);
        }
    }

    static int agnosticProblem(int arr[] , int target){
        int st = 0;
        int en = arr.length -1;

        boolean asce;
        if (arr[st]<arr[en]){
            asce = true;
        }
        else {
            asce = false;
        }

        int mid = st + (en-st)/2;

        if (asce){
            ascendingOrder(arr,target);
        }
        else {
            descending(arr,target);
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,34,56,78,90,99};
        int [] arr1 = {99,90,78,56,34,2,1};
//        System.out.println(ascendingOrder(arr,56));
        System.out.println(agnosticProblem(arr,90));
//        System.out.println(descending(arr1,56));

    }
}
