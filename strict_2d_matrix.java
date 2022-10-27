package com.company;

import java.util.Arrays;

public class strict_2d_matrix {
    static int[] ans(int[][]arr,int target){
        int r = arr.length;
        int c = arr[0].length;

        int st = 0;
        int en = (r*c)-1;

        while (st<=en){
            int mid = st +(en-st)/2;
            int element = arr[mid/c][mid%c];

            if (target==element){
                return new int[]{mid/c,mid%c};
            }
            else if(target > element){
                st = mid +1;
            }
            else{
                en = mid -1;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(ans(arr,3)));
    }
}
