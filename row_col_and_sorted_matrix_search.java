package com.company;
import java.util.Arrays;
public class row_col_and_sorted_matrix_search {
    static int[] row_col(int[][]arr,int target){
        int r = 0;
        int c = arr[0].length -1;

        while (r<arr.length && c>=0){
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
    static int[] binarySearchIn2DArray(int[][]arr,int target){
        int r = arr.length;
        int c = arr[0].length;

        int st = 0;
        int en = (r*c)-1;

        while (st<=en){
            int mid = st + (en-st)/2;
            int element = arr[mid/c][mid%c];

            if (target==element){
                return new int[]{mid/c,mid%c};
            }
            else if(target>element){
                st = mid+1;
            }
            else{
                en = mid -1;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [][]arr = {
                {1,2,3,4},
                {5,6,7},
                {8,9,10,11}
        };
        int [][] arr1 = {
                {1,2,3,9},
                {5,7,6,12},
                {11,13,14,15}
        };
//        System.out.println(Arrays.toString(binarySearchIn2DArray(arr,11)));
        System.out.println(Arrays.toString(row_col(arr1,15)));
    }
}
