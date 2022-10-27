package com.company;

public class rev_split {
    static int ans(int []arr,int m){
        int st = 0;
        int en = 0;

        for (int i = 0; i <arr.length ; i++) {
            st = Math.max(st,arr[i]);
            en += arr[i];
        }

        while (st<en){
            int mid = st + (en-st)/2;

            int sum = 0;
            int pieces = 1;

            for (int num:arr) {
                if (num+ sum > mid){
                    sum = num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if (pieces<=m){
                en = mid;
            }
            else{
                st = mid +1;
            }
        }
        return st;
    }
    public static void main(String[] args) {
        int []arr ={7,2,5,10,8};
        System.out.println(ans(arr,2));
    }
}
