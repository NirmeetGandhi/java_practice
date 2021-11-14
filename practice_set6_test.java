package com.company;

public class practice_set6_test {
    public static void main(String[] args) {
        int [][] marks1 = {{1,2,3},
                           {4,5,6}};
        int [][] marks2 = {{1,2,3},
                           {4,5,6}};

        int [][] result = {{0,0,0},
                           {0,0,0}};

        for(int i=0;i<marks1.length;i++){
            for (int j=0;j<marks1[i].length;j++){
                result [i][j] = marks1[i][j]  + marks2 [i][j];
            }
        }
        for(int i=0;i<marks1.length;i++){
            for (int j=0;j<marks1[i].length;j++){
                System.out.print(result[i][j]+ " ");
//                result [i][j] = marks1[i][j]  + marks2 [i][j];
            }

            System.out.print("\n");
        }


    }
}
