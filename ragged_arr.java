package com.company;
class regged_class{
    static void ragged_method(){
        System.out.println("Hola");
        int a[][];
        a = new int[4][];

        a[0] = new int[2];
        a[1] = new int[3];
        a[2] = new int[1];
        a[3] = new int[4];

//        1st raw that has 2 elements(column)
        a[0][0] = 1;
        a[0][1] = 2;

//        2nd raw that has 3 elements(column)
        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 5;

//        3rd raw that has 1 elements(column)
        a[2][0] = 6;

//        4th raw that has 4 elements(column)
        a[3][0] = 7;
        a[3][1] = 8;
        a[3][2] = 9;
        a[3][3] = 10;


        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
        //        int b[][] = new int[2][];
    }
}
public class ragged_arr {
//    static void ragged(){
//        System.out.println("Hola");
//        int a[][];
//        a = new int[4][];
//
//        a[0] = new int[2];
//        a[1] = new int[3];
//        a[2] = new int[1];
//        a[3] = new int[4];
//
////        1st raw that has 2 elements(column)
//        a[0][0] = 1;
//        a[0][1] = 2;
//
////        2nd raw that has 3 elements(column)
//        a[1][0] = 3;
//        a[1][1] = 4;
//        a[1][2] = 5;
//
////        3rd raw that has 1 elements(column)
//        a[2][0] = 6;
//
////        4th raw that has 4 elements(column)
//        a[3][0] = 7;
//        a[3][1] = 8;
//        a[3][2] = 9;
//        a[3][3] = 10;
//
//
//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a[i].length;j++){
//                System.out.println(a[i][j]);
//            }
//            System.out.println();
//        }
//        //        int b[][] = new int[2][];
//    }
    public static void main(String[] args) {
        System.out.println("Welcome");
        regged_class r = new regged_class();
        r.ragged_method();
    }
}
