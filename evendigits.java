package com.company;

public class evendigits {

    static int ans(int arr[]){
        int count = 0;
        for (int element:arr) {
            if (checkEven(element)){
                count++;
            }
        }
        return count;
    }
    static boolean checkEven(int num){
        int evenNumber = count(num);
        if (evenNumber % 2==0){
            return true;
        }
        return false;
    }
    static int count(int num){
        if (num<0){
            num = num * (-1);
        }
        if (num==0){
            return 1;
        }
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }
    public static void main(String[] args) {
    int arr[] = {1,234,34,5687,2};
        System.out.println(ans(arr));
    }
}
