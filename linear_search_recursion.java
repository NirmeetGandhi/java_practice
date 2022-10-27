package com.company;

public class linear_search_recursion {
    static boolean ans(int[]arr,int target,int i){
        if (i == arr.length ){
            return false;
        }
        if (arr[i]==target){
            return true;
        }

         return ans(arr,target,i+1);
    }
    static int ans1(int[]arr,int target,int i){
        if (i == arr.length ){
            return -1;
        }
        if (arr[i]==target){
            return i;
        }

        return ans1(arr,target,i+1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,45,76};
        System.out.println(ans(arr,76,0));
        System.out.println(ans1(arr,76,0));
    }
}
