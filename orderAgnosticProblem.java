package com.company;

public class orderAgnosticProblem {
    static int ans(int [] arr , int target){
        int st = 0;
        int en = arr.length -1;
        boolean isCheck;
        if (arr[st]<arr[en]){
            isCheck = true;
        }
        else{
            isCheck = false;
        }
        while (st<=en){
            int mid = st + (en-st)/2;

            if (target == arr[mid]){
                return mid;
            }
            else if (isCheck){
                if (target < arr[mid]){
                    en = mid -1;
                }
                else {
                    st = mid +1;
                }
            }
            else {
                if (target > arr[mid]){
                    st = mid +1;
                }
                else {
                    en= mid -1;
                }
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int [] arr1 = {7,6,5,4,3,2,1};

        System.out.println(ans(arr,6));
        System.out.println(ans(arr1,1));
    }
}
