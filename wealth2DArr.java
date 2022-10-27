package com.company;

public class wealth2DArr {
    static int maxWealth(int [][] accounts){
        int row_sum = 0;
        int max = 0;
        for (int i = 0; i <accounts.length ; i++) {
            row_sum = 0;
            for (int j = 0; j <accounts[i].length ; j++) {
                row_sum += accounts[i][j];
            }
            if (row_sum>max){
                max = row_sum;
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

        System.out.println(maxWealth(arr));
    }
}
