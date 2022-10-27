package com.company;

public class CheckForThePowerOf2 {
    static boolean ans(int n){
        if (n==0){
            return false;
        }
        return ((n&(n-1))==0);
    }
    public static void main(String[] args) {
        int n = 8;
        int count = 0;
        while (n>0){
            int last = n & 1;
            if(last==1){
                count++;
            }
            n = n>>1;
        }
        if(count==1){
            System.out.println("Yup!!It is the power of 2");
        }
        else{
            System.out.println("Nope");
        }
        System.out.println(ans(8));
    }
}
