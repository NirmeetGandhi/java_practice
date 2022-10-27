package com.company;

public class infiii {
    static int binarySearch(int[]arr,int target,int st,int en){
        while (st<=en){
            int mid = st + (en-st)/2;
            if (target==arr[mid]){
                return mid;

            }
            else if(target > arr[mid]){
                st = mid+1;
            }
            else{
                en = mid -1;
            }
        }
        return -1;
    }
    static int ans(int[]arr,int target){
        int st = 0;
        int en = 1;
        while (target > arr[en]){
            int new_st = en +1;
            en = en + (en-st+1)*2;
            st = new_st;
        }
        return binarySearch(arr,target,st,en);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17};
        System.out.println(ans(arr,3));
    }
}
