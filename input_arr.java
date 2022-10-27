package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class input_arr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

//        System.out.println("Enter the size of an array:");
//        int len = sc.nextInt();
//        int user_raw = sc.nextInt();
//        int user_column = sc.nextInt();
        int user = sc.nextInt();
//        int arr[] = new int[len];
//
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.println(arr[i] + " ");
//        }

//        int sample[];
//        sample = new int[user];

//        System.out.println("Enter " + user + " elements to Insert in an array");

//        for (int i = 0; i <sample.length ; i++) {
//            sample[i] = sc.nextInt();
//        }
//        System.out.println("The elements are:");

        // 1ST METHOD TO PRINT AN ARRAY
//        for (int i = 0; i <sample.length ; i++) {
//            System.out.print(sample[i] + " ");
//        }

        // 2ND METHOD TO PRINT AN ARRAY
//        for (int num:sample) {
//            System.out.print(num + " ");
//        }
//        System.out.println();

        // 3RD METHOD TO PRINT AN ARRAY
//        System.out.println(Arrays.toString(sample));

        String str[];
        str = new String[user];

        for (int i = 0; i <str.length ; i++) {
            str[i] = sc.next();
        }
        str[1] = "is";
        str[2] = "the";
        System.out.println(Arrays.toString(str));

//
//        int twod[][];
////        System.out.println("Enter no of rows and columns");
//        twod = new int[user_raw][user_column];
//
//        for (int i = 0; i <twod.length ; i++) {
//            for (int j = 0; j <twod[i].length ; j++) {
//                twod[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println(Arrays.toString(twod));
    }
}
