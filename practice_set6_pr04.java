package com.company;

public class practice_set6_pr04 {
    public static void main(String[] args) {
        int [][] marks = { {1,2,3},
                           {4,5,6}};

        int [][] marks2 = { {1,2,3},
                           {4,5,6}};

        int [][] result = {{0,0,0},
                           {0,0,0}};

        for (int i=0;i<marks.length;i++){
            for (int j=0;j<marks[i].length;j++){
                result [i][j] = marks[i][j] + marks2[i][j];
            }

        }
        for (int i=0;i<marks.length;i++){
            for (int j=0;j<marks[i].length;j++){
                System.out.print(result[i][j]+" ");
//                result [i][j] = marks[i][j] + marks2[i][j];
            }
            System.out.print("\n");

        }





    }
}
