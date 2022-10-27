package com.company;

public class max_rev {
    static int max(int arr[]){
        int max= arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        max(a);

    }
}
