package com.company;

public class twoD_arr {
    public static void main(String[] args) {
        System.out.println("Welcome");
        int a[][];
        a = new int[2][3];

        int b[][];

        b = new int[3][2];
        b[0][0] = 1;
        b[0][1] = 2;

        b[1][0] = 3;
        b[1][1] = 4;

        b[2][0] = 5;
        b[2][1] = 6;

        System.out.println("B Matrix:");
        for (int p=0;p<b.length;p++){
            for (int q=0;q<b[p].length;q++){
                System.out.print(b[p][q]);
            }
            System.out.println();
        }




        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;

        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;

        System.out.println("A Matrix:");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
