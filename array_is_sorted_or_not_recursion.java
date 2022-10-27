package com.company;

public class array_is_sorted_or_not_recursion {
    static boolean ans(int[]arr,int i){
        if (i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && ans(arr,i+1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,14,5};
        System.out.println(ans(arr,0));
    }
}
