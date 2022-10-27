package com.company;

public class SplitTheLargestSum {
    static int ans(int[]arr,int m){
        int st = 0;
        int en = 0;
        for (int i = 0; i <arr.length-1 ; i++) {
            st = Math.max(st,arr[i]);
            en += arr[i];
        }
            while (st<en){
            int mid = st + (en-st)/2;
            int sum =0;
            int pieces= 1;
            for (int num:arr) {
                if (sum + num > mid) {
                    sum = mid;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            //after this stage we have pieces
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
        int [] arr=  {7,2,5,10,8};
        System.out.println(ans(arr,2));
    }
}
