package com.company;

public class practice_set6_pr05 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int l = arr.length;
        int temp;
        int n = Math.floorDiv(arr.length,2); // 5/2 = 2.5 nut floorDiv will give only integer value here 2

        for (int i=0;i<n;i++){
            temp  = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }

        for (int e:arr){
            System.out.print("{ "+ e+ " }");
        }

    }
}
