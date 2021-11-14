package com.company;

public class nir22_arrays {
    public static void main(String[] args) {

//        1st method to declare array
        int [] marks = new int[5];
        //String [] marks1 = new String[600];
        //System.out.println(marks[2]); // print assigned value in array
        marks[0] = 100; // assign a value in array
        marks[1] = 200; // assign a value in array
        marks[2] = 300; // assign a value in array
        marks[3] = 400; // assign a value in array
        marks[4] = 500; // assign a value in array
        /*WE CAN ALSO OVERRIGHT THE VALUE OF AN ARRAY SUPPOSE ABOVE MARKS[4]=500 BUT IF I DO MARKS[4] = 600 THEN
        THE VALUE INSIDE MARKS[4] WILL GET OVERRIGHT AND UPDATE TO 600*/
        marks[4] = 600; // assign a value in array

//        System.out.println(marks);

//        2nd method to declare array
          int [] marks1;
          marks1 = new int[5];

          marks1[0] = 34;
          marks1[1] = 44;
          marks1[2] = 54;

//          3rd method to declare array and memory allocation
            int [] marks3 = {100,300,400,500,500,699};
            System.out.println(marks[4]);



    }
}
