package com.company;

public class imp_concept_Array {
    static void change(int arr[]){
        arr[0] = 98;
    }
    public static void main(String[] args) {
        int [] marks = {1,2,3,4,5};
        System.out.println("Array before changing the 0th element Array of marks was");
        for (int e:marks){
            System.out.println(e);
        }
        change(marks);
        System.out.println("The changed marks are: " + marks[0]);
        System.out.println("After changing the 0th element Array of marks is:");
        for (int e:marks){
            System.out.println(e);
        }
    }
}

