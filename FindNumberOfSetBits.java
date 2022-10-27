package com.company;

public class FindNumberOfSetBits {
    static int ans(int n){
        int count = 0;
        while (n>0){
            if ((n&1)==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(ans(9));
//        long n = 121212121212129l;
//        System.out.println(Long.toBinaryString(n));
    }
}
