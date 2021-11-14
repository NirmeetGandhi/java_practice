package com.company;

public class nir23_foreach {
    public static void main(String[] args) {
        int [] arr = {34,45,67,78};
//        System.out.println(arr.length);
        //Displaying loop in normal order (for-loop)
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //displaying loop in reverse order (for-loop)
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

        //third way to directly get all tje elements of an array (for-each loop)
        for (int element : arr){
            System.out.println(element);
        }
    }
}
