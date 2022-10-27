package com.company;

public class recursion_binary_search {
    static int binarySearch(int[]arr,int target,int st,int en){
            if(st>en){
                return -1;
            }
            int mid = st + (en-st)/2;

            if (target==arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                return binarySearch(arr,target,mid+1,arr.length-1);
            }
            else if(target < arr[mid]){
                return binarySearch(arr,target,st,mid-1);
            }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(binarySearch(arr,4,0,arr.length-1));
    }
}
