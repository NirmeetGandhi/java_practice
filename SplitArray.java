package com.company;

//(1)Split Array Largest Sum
//https://leetcode.com/problems/split-array-largest-sum/submissions/
public class SplitArray {
    public int splitArray(int[] arr, int m) {
        int st = 0;
        int en = 0;
        for (int i = 0; i <arr.length ; i++) {
            st = Math.max(st,arr[i]);
            en += arr[i];
        }
        //now we will apply binarySearch
        while (st<en){
            int mid = st + (en-st)/2;

            //calculate that in how many max pieces you can diVide this with mid max sum
            int sum = 0;
            int pieces = 1;

            for (int num:arr) {
                if (sum + num > mid){
                    //You can't add this in this sun array make new one
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }
            //after the above steps we will have pieces
            if (pieces <= m){
                en = mid;
            }
            else{
                st = mid +1;
            }
        }
return st;
    }
    public static void main(String[] args) {

    }
}
