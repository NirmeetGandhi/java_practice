package com.company;

public class BSSqrt {
    static double sqrt(int n,int p){
        int st = 0;
        int en = n;
        double root = 0.0;
        while(st<=en){
            int mid = st + (en-st)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid * mid > n){
                en = mid -1;
            }
            else{
                st = mid +1;
            }
        }
        double inc = 0.1;
        for (int i = 0; i <=p ; i++) {
            while (root*root<=n){
                root += inc;
            }
            root = root - inc;
            inc= inc/10;
        }

        return root;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(40,3));
    }
}
