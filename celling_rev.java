package com.company;

public class celling_rev {
    static int celling(int [] arr, int target){
        int st = 0;
        int en = arr.length -1;

        while (st<=en){
            int mid = st + (en-st)/2;
            if (target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                st = mid +1;
            }
            else {
                en = mid -1;
            }
        }
        return st;
    }
    public static void main(String[] args) {
        int [] arr = {1,23, 34,45,667};
        System.out.println(celling(arr,22));
    }
}
