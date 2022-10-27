package com.company;

public class patterns_recursion {
    static void ans(int r,int c){
        if (r==0){
            return;
        }
        if (c<=r){
            System.out.print("*");
            ans(r,c+1);
        }
        else{
            System.out.println();
            ans(r-1,1);
        }
    }
    static void ans2(int r,int c){
        if (r==0){
            return;
        }
        if (c<r){
            ans(r,c+1);
            System.out.print("*");
        }
        else{
            ans(r-1,0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
//            ans(4,1);
//        System.out.println();
            ans2(4,0);
    }
}
