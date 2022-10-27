package com.company;

public class squareroot {
    static int ans(int n){
        for (int i =  2; i <n ; i++) {
            if (i*i==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(ans(36));
        System.out.println(Math.sqrt(36));
    }
}
