package com.company;

import java.util.Arrays;

public class search_in_2D_matrix {
    static int[] search(int [][] arr,int target){
        int r = 0;
        int c = arr.length -1;

        while (r<arr.length && c>=0){
            if (target == arr[r][c]){
                return new int[]{r,c};
            }
            else if(target > arr[r][c]){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30},
                {15,25,35},
                {28,29,37},
                {33,34,38}
        };
        System.out.println(Arrays.toString(search(arr,37)));
    }
}
