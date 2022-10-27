package com.company;

import java.util.Arrays;

public class searchIn2DMatrix {
    static int[] strict(int[][]arr,int target){
        int r= arr.length;
        int c = arr[0].length;

        int st = 0;
        int en = (r*c)-1;

        while (st<=en){
            int mid = st + (en-st)/2;
            int element = arr[mid/c][mid%c];

            if (target==element){
                return new int[]{mid/c,mid%c};
            }
            if(target > element){
                st = mid +1;
            }
            else{
                en = mid -1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] row_column_Sorted(int[][]arr,int target){
        int r = 0;
        int c = arr[0].length -1;

        while (r<c){
            int element = arr[r][c];
            if (target==element){
                return new int[]{r,c};
            }
            if (target > element){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][]arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//        System.out.println(Arrays.toString(strict(arr,9)));
        int [][]arr1 = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(strict(arr1,50)));
    }
}
