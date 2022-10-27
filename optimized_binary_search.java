package com.company;

public class optimized_binary_search {
    static int ans(int [] arr , int target){
        int st = 0;
        int en = (arr.length) -1 ;

        while (st<=en){
        int mid = st + (en-st)/2;
            if (target<arr[mid]){
                en = mid-1;
            }
            else if (target>arr[mid]){
                st = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int descending(int [] arr , int target){
            int st = 0;
            int en = (arr.length) -1 ;

            while (st<=en){
                int mid = st + (en-st)/2;
                if (target>arr[mid]){
                    en = mid-1;
                }
                else if (target<arr[mid]){
                    st = mid+1;
                }
                else {
                    return mid;
                }
            }
            return -1;
        }
    public static void main(String[] args) {
        int arr[] = {1,2,34,56,78,90,99};
        int [] arr1 = {99,90,78,56,34,2,1};
//        System.out.println(ans(arr,56));
//        System.out.println(descending(arr1,90));
    }
}
