package com.company;

public class even_problem {
    static int count(int n){
        if (n<0){
            n = n * (-1);
        }
        if (n==0){
            return 1;
        }
       return (int)Math.log10(n)+1;
//        int count = 0;
//        while (n>0){
//            count++;
//            n = n/10;
//        }
//        return count;
    }
    static boolean checkEven(int num){
        int evenNum = count(num);
        if (evenNum % 2 ==0){
            return true;
        }
        return false;
    }
    static int ans(int arr[]){
        int count = 0;
        for (int element:arr) {
            if (checkEven(element)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,44,5};
        System.out.println(ans(arr));
    }
}
