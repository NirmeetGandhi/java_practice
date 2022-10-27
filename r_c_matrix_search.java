package com.company;

import java.util.Arrays;

public class r_c_matrix_search {
    static int[] ans(int[][]arr,int target){
        int r= 0;
        int c = arr[0].length -1;

        while (r<arr.length && c>=0){
            int element = arr[r][c];
            if (target==element){
                return new int[]{r,c};
            }
            else if(target >element){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [][] arr1 = {
                {1,2,3,9},
                {5,7,6,12},
                {11,13,14,15}
        };
//        System.out.println(Arrays.toString(binarySearchIn2DArray(arr,11)));
        System.out.println(Arrays.toString(ans(arr1,15)));
    }
}
