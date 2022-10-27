package com.company;

public class last_first {
    static int binarySearch(int [] arr,int target,boolean isCheck){
        int st= 0;
        int en =arr.length -1;
        int ans =-1;

        while (st<=en){
            int mid = st + (en-st)/2;
            if (target > arr[mid]){
                st = mid +1;
            }
            else if(target < arr[mid]){
                en = mid -1;
            }
            else{
                ans = mid;
                if (isCheck){
                    en = mid -1;
                }
                else{
                    st = mid +1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
