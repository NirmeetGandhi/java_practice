package com.company;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Enter the element to search in array");
        int ser = sc.nextInt();


        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == ser){
                System.out.println("Found at index no: " + arr[i-1]);
                break;
            }
        }
//        System.out.println("Not found");
    }
}
