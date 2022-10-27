package com.company;

import java.util.Arrays;

public class search_in_row_col_sorted_matrix {
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix[0].length -1;

        while (r < matrix.length && c>=0){
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
    public static void main(String [] args){
        int [][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,1)));
    }
}
