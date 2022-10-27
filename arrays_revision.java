package com.company;
import java.util.Arrays;
import java.util.Scanner;

class demoStr{


    static void twod_arr(){
        Scanner sc = new Scanner(System.in);
        int a[][]  = new int[3][];
        a[0] = new int[3];
        a[1] = new int[4];
        a[2] = new int[5];

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                a[i][j] = sc.nextInt();
            }
        }

//        for (int i = 0; i <a.length ; i++) {
//            for (int j = 0; j <a[i].length ; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i <a.length ; i++) {
//            System.out.println(Arrays.toString(a[i]));
//        }
//
        for (int e[]:a) {
            System.out.println(Arrays.toString(e));
        }
    }

    static void oned_arr(){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        for (int i = 0; i <a.length ; i++) {
            a[i] = sc.nextInt();
        }

//        for (int i = 0; i <a.length ; i++) {
//            System.out.print(a[i] + " ");
//        }

        for (int e:a) {
            System.out.print(e + " ");
        }
//        System.out.println(Arrays.toString(a));
    }


}
public class arrays_revision {

    public static void main(String[] args) {
        demoStr s = new demoStr();
//        s.twod_arr();
        s.oned_arr();
    }
}
