package com.company;

public class wealth_problem {
    static int twod(int arr[][]){
        int row_sum = 0;
        int max = 0;
        for (int i = 0; i <arr.length ; i++) {
            row_sum = 0;
            for (int j = 0; j <arr[i].length ; j++) {
                row_sum += arr[i][j];
            }
            if (row_sum>max){
                max = max + row_sum;
//                max = 0;
            }
        }
            return max;
    }
    public static void main(String[] args) {
        int arr[][] = {
                {2,8,10},
                {7,1,3},
                {1,9,5}
        };

        System.out.println(twod(arr));
    }
}
