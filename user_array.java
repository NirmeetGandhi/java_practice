package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class user_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int s1,s2,s3,s4;
//        System.out.println("Enter 1st number");
//        s1 = sc.nextInt();
//        System.out.println("Enter 2nd number");
//        s2 = sc.nextInt();
//        System.out.println("Enter 3rd number");
//        s3 = sc.nextInt();
//        System.out.println("Enter 4th number");
//        s4 = sc.nextInt();

        // 1 Way
        int a[][][][];
        a = new int[2][2][2][2];
        a[0][0][0][0] = 1;
        a[0][0][0][1] = 2;
        a[0][0][1][0] = 3;
        a[0][0][1][1] = 4;
        a[0][1][0][0] = 5;
        a[0][1][0][1] = 6;
        a[0][1][1][0] = 7;
        a[0][1][1][1] = 8;
        a[1][0][0][0] = 9;
        a[1][0][0][1] = 10;
        a[1][0][1][0] = 11;
        a[1][0][1][1] = 12;
        a[1][1][0][0] = 13;
        a[1][1][0][1] = 14;
        a[1][1][1][0] = 15;
        a[1][1][1][1] = 16;

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                for (int k=0;k<a[j].length;k++){
                    for (int l=0;l<a[k].length;l++){
                        System.out.println("a[" + i + "][" + j + "][" + k + "][" + l + "] =" + "[" + a[i][j][k][l] + "]" );
//                        System.out.println();
                    }
                }
            }
        }


        // 2nd Way
          int c[] = new int[5];
          c[0] = 1;
          c[1] = 2;
          c[2] = 3;
          c[3] = 4;
          c[4] = 5;

          // 3rd way where you don't need to declare the size of an array , once you will put elements it will automatically detect the size
          int d[] = {1,2,3,4,5};
          int b[][] = {{1,2,3,4,5,6,7,8},{5,6,7,8}};

//          for (int p=0;p<b.length;p++){
//              for (int q=0;q<b[p].length;q++){
//                  System.out.print(b[p][q] + " ");
//              }
//              System.out.println();
//          }






//        a[0][0][0] = 1;
//        a[0][0][1] = 2;
//        a[0][1][0] = 3;
//        a[0][1][1] = 4;
//        a[1][0][0] = 5;
//        a[1][0][1] = 6;
//        a[1][1][0] = 7;
//        a[1][1][1] = 8;

//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a[i].length;j++){
//                for (int k=0;k<a[j].length;k++){
//                    for (int l=0;l<a[k].length;l++){
//                        System.out.println("arr[" + i + "][" + j + "][" + k + "][" + l + "] =" + "[" + a[i][j][k][l] + "]" );
////                        System.out.println();
//                    }
//                }
//            }
//        }
//         a[0][0] = s1;
//         a[0][1] = s2;
//         a[1][0] = s3;
//         a[1][1] = s4;
//
//
//         for (int i=0;i<a.length;i++){
//            for (int j=0;j<a[i].length;j++){
//                System.out.println(a[i][j]);
//            }
//         }

//        int a[][];
//        a = new int[2][];
//        a[0] = new int[2];
//        a[1] = new int[3];
//
//        a[0][0] = 1;
//        a[0][1] = 2;
//
//        a[1][0] = 3;
//        a[1][1] = 4;
//        a[1][2] = 5;
//
//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a[i].length;j++){
//                System.out.print(a[i][j]);
//            }
//
//        }

        int array[];
        array =  new int[3];
        array[0] = 23;
        array[1] = 13;
        array[2] = 43;


        int array1[] = new int[7];
        array1[0] = 23;
        array1[1] = 13;
        array1[2] = 43;
        array1[3] = 343;
        array1[4] = 45;
        array1[5] = 433;
        array1[6] = 432;


        int arr1[][]= {{0,1,3},{2,3,4,5}};

        int arr2[][];
        arr2 = new int[2][2];
        arr2[0][0] = 0;
        arr2[0][1] = 1;
        arr2[1][0] = 2;
        arr2[1][1] = 3;

//        for (int i=0;i<arr1.length;i++){
//            for (int j=0;j<arr1[i].length;j++){
//                System.out.print(arr1[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for (int k=0;k<arr2.length;k++){
//            for (int l=0;l<arr2[k].length;l++){
//                System.out.print(arr2[k][l] + " ");
//            }
//            System.out.println();
//        }





    }
}
