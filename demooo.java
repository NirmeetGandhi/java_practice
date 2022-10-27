package com.company;

public class demooo {
    static int demo(int [] arr,int target){
        int st = 0;
        int en = arr.length -1;
        while (st<=en){
            int mid = st +(en-st)/2;
//            if (arr[mid] == target){
//                return mid;
//            }
            if (target>arr[mid]){
                st = mid +1;
            }
            else if(target<arr[mid]) {
                en = mid -1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] ar = {1,2,3,4,5,6};
        System.out.println(demo(ar,4));
    }
}


