package com.company;

import java.util.Arrays;

public class merge_sort {
    static void combine(int [] arr,int st,int mid,int en){
        int [] merged = new int[en-st+1];
        int indx1 = st;
        int indx2  = mid+1;
        int x = 0;

        while (indx1<=mid && indx2<=en){
            if (arr[indx1]<=arr[indx2]){
                merged[x++] = arr[indx1++];
            }
            else{
                merged[x++] = arr[indx2++];
            }
        }
        while (indx1<=mid){
            merged[x++] = arr[indx1++];
        }
        while (indx2<=en){
            merged[x++] = arr[indx2++];
        }
        for (int i = 0 , j=st; i <merged.length ; i++,j++) {
            arr[j] = merged[i];
        }

    }
    static void divide(int [] arr,int st,int en){
        while (st<en){
            int mid = st + (en-st)/2;
            divide(arr,st,mid);
            divide(arr,mid+1,en);
            combine(arr,st,mid,en);
        }
    }
    public static void main(String[] args) {
        int [] arr= {1,3,4,2,6,8};
        divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
