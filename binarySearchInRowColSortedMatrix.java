package com.company;

import java.util.Arrays;

public class binarySearchInRowColSortedMatrix {
    static int[] search(int[][]arr,int target){
        int r = 0;
        int c = arr.length -1;

        while (r < arr.length && c>=0){
            int element = arr[r][c];
            if (target==element){
                return new int[]{r,c};
            }
            else if(target > element){
                r++;
            }
            else{
             c--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,4)));
    }
}
