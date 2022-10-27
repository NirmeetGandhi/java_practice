package com.company;

public class SmallestLetterGTargetLeetCode {
    static int ans(char [] arr ,char target){
        int st = 0;
        int en = arr.length -1;

        while (st<=en){
            int mid = st + (en-st)/2;

            if (target < arr[mid]){
                en = mid -1;
            }
            else {
                st = mid +1;
            }
        }
        return st % arr.length;
    }
    public static void main(String[] args) {
        char [] ch = {'c','f','j'};
        System.out.println(ans(ch,'g'));
    }
}
