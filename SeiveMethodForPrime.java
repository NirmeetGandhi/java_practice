package com.company;

public class SeiveMethodForPrime {

    static void ans(int n,boolean [] arr){

        for (int i = 2; i*i <=n ; i++) {
            //if element is false means the number is prime
            if (!arr[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    arr[j]=true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if (!arr[i]){
                System.out.print(i+ " ");
            }
        }
    }
    public static void main(String[] args) {
        int n = 40;
        //initially all the elements in boolean array will be false

        boolean []arr = new boolean[n+1];
        ans(n,arr);
    }
}
