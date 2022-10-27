package com.company;

public class demoOrderAgnostic {
    static int ans(int [] arr , int target){
        int st = 0;
        int en = arr.length -1;

        while (st<=en){

            int mid = st + (en-st)/2;

            if (target == arr[mid]){
                return mid;
            }
            boolean checkForAscending;
            if (arr[st]<arr[en]){
                checkForAscending = true;
            }
            else{
              checkForAscending = false;
            }

            if (checkForAscending){
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

        System.out.println(ans(arr,56));
        System.out.println(ans(arr1,56));
    }
}
