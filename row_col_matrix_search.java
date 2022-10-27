package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class row_col_matrix_search {
    static int[] search(int [][] arr,int target){
        int r = 0;
        int c = arr[0].length -1;

        while (r < arr.length & c>=0){
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
    public static void main(String []args){
        int [][] arr = {
                {1,2,3,9},
                {5,7,6,12},
                {11,13,14,15}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search in matrix");
        int a = sc.nextInt();
        System.out.println(Arrays.toString(search(arr,a)));
    }
}
