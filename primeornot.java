package com.company;

public class primeornot {
    //Time Complexity = O(n)
    static boolean ans(int n){
        for (int i = 2; i <n ; i++) {
            if (n % i ==0){
//                System.out.println("Not Prime");
                return false;
            }
        }
        return true;
    }
    static boolean ans1(int n){
        int c = 2;
        while (c*c< n){//c < Math.sqrt(n) --> multiply both sides √n * √n = n so c*c = n
            if (n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(ans(13));
        System.out.println(ans1(13));
        int n = 30;
        for (int i = 2; i <=n ; i++) {
            if (ans1(i)){
                System.out.println(i);
            }
        }
    }
}
