package com.company;

public class swapping {
    static  void swapped(int arr[], int i,int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println("New array");
        for (int w:arr) {
            System.out.print(w + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println("Old array:");
        for (int e:a) {
            System.out.print(e + " ");
        }
        swapped(a,2,4);
    }
}
