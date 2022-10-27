package com.company;

public class lsearch {
    //Method with void parameter
    static void search(int arr[] , int target){

        //Basic checks
        if (arr.length == 0){
            System.out.println("Empty Array");
        }

        //Runs a for loop to iterate the array
        for (int i = 0; i <arr.length ; i++) {
            // This if condition will get check to find the target
            if (arr[i]==target){
                System.out.println("Element found at index no: " + i);
                break;
            }
        }
    }
    static int se(int arr[], int target){

        //Basic checks
        if (arr.length == 0){
            System.out.println("Empty Array");
            return -1;
        }

        //Runs a for loop to iterate the array
        for (int i = 0; i <arr.length ; i++) {
            // This if condition will get check to find the target
            if (arr[i]==target) {
                System.out.print("Index no :");
                return i;
            }
        }
        //This line will only execute when the element is not found in array
        return -1;
    }
    static boolean ser(int arr[] , int target){
        //Basic checks
        if (arr.length == 0){
            System.out.println("Empty Array");
            return false;
        }

        //Runs a for loop to iterate the array
        for (int i = 0; i <arr.length ; i++) {
            // This if condition will get check to find the target
            if (arr[i]==target){
                return true;
            }
        }
        //This line will only execute when the element is not found in array
        return false;
    }
     public static void main(String []args){
        int arr[] = {1,2,3,-1,4,5,5};
//        search(arr,5);
        System.out.println(se(arr,-1));
        System.out.println(ser(arr,-1));
    }
}
