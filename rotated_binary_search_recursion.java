package com.company;

public class rotated_binary_search_recursion {
    static int RBS(int[]arr,int target,int st,int en){
        if(st>en){
            return -1;

        }
        int mid = st + (en-st)/2;
        if (arr[mid]==target){
            return mid;
        }
        //Means first half is sorted
        if (arr[st]<=arr[mid]){
            if (target > arr[st] && target<arr[mid]){
                return RBS(arr,target,st,mid-1);
            }
            else{
                return RBS(arr,target,mid+1,en);
            }
        }
        if (arr[st]>=arr[mid]){
            if (target > arr[mid] && target < arr[en]){
                return RBS(arr,target,mid+1,en);
            }
        }
        return RBS(arr,target,st,mid-1);
    }
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(RBS(arr,1,0,arr.length-1));
    }
}
