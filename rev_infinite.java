package com.company;

public class rev_infinite {
    static int binarySearch(int [] arr,int target,int st,int en){
        while (st<=en){
            int mid = st + (en-st)/2;
            if (target==arr[mid]){
                return mid;
            }
            else if(target >arr[mid]){
                st = mid +1;
            }
            else if(target <arr[mid]){
                en = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int ansOfInfiniteArray(int []arr,int target){
        int st =0;
        int en =1;

        while (target > arr[en]){
            int new_St = en +1;
            en = en + (en-st+1)*2;
            st = new_St;
        }
        return binarySearch(arr,target,st,en);
    }
    public static void main(String[] args) {

    }
}
