package com.company;

import java.util.Arrays;

public class search_in_2D_array{
    //If random elements are given in matrix
    static int[] searchIn2DArr(int [][] arr,int target){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]==target){
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int[] searchInSortedMatrix(int [][] matrix,int target){
        int r = 0;
        int c = matrix[0].length -1;

        while (r < matrix.length && c >=0){
            if (target == matrix[r][c]){
                return new int[]{r,c};
            }
            else if(target > matrix[r][c]){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
//        int [][] arr = {
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12}
//        };
        int [][] arr = {
                {10,20,30},
                {15,25,35},
                {28,29,37},
                {33,34,38}
        };
//        System.out.println(Arrays.toString(searchIn2DArr(arr,11)));
        System.out.println(Arrays.toString(searchInSortedMatrix(arr,37)));
    }
}
