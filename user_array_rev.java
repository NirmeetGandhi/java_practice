package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class user_array_rev {
    public static void main(String[] args) {
        //1st way where we declare as well as initialize and assign the values
        Scanner sc = new Scanner(System.in);
        int marks[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        // for loop to take input from the user
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        // 1st method
        //for loop to print the elements entered by the user
//        for (int i = 0; i < marks.length; i++) {
//                for (int j = 0; j < marks[i].length; j++) {
//                    System.out.print(marks[i][j] + " ");
//                }
//                System.out.println();
//            }

        // 2nd method
        //for-each loop to print the elements entered by the user
        for (int[] e:marks) {
            System.out.println(Arrays.toString(e));
        }

        // 3rd method
        //for loop using Arrays.toString() method
//        for (int i = 0; i <marks.length ; i++) {
//            System.out.println(Arrays.toString(marks[i]));
//        }
    }

    }

