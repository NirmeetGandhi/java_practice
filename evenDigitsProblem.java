package com.company;

import java.awt.image.ShortLookupTable;

public class evenDigitsProblem {
    static int countNos(int num){
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

    static boolean checkEven(int num){
        int evenNumber = countNos(num);

        if (evenNumber % 2 ==0){
            return true;
        }
        return false;
    }
    static int answer(int arr[]){
        int count = 0;
        for (int element:arr) {
            if (checkEven(element)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2345,45,67,8};
        System.out.println(answer(arr));
    }
}
