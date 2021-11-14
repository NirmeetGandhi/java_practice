package com.company;

public class practice_set6_pr06 {
    public static void main(String[] args) {
        int []arr = {1,2,667,7,54,33};

        int max = -2147483648;

        for (int e:arr){
            if (e>max){
                max = e;
            }

        }
        System.out.println("The max number is: "+ max);


    }
}
