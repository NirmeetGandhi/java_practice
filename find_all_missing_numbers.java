package com.company;
import java.util.ArrayList;
import java.util.List
        ;
public class find_all_missing_numbers {
    static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static ArrayList<Integer> ans1(int[] arr){
        int i =0;
        while (i<arr.length){
            int correctIndex = arr[i] -1;
            if (arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int j = 0; j <arr.length ; j++) {
            if (arr[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(ans1(arr));
    }
}
