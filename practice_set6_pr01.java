package com.company;

public class practice_set6_pr01 {
    public static void main(String[] args) {
        float [] numbers = {0.1f,0.2f,0.3f,0.4f,0.5f};
        float sum = 0;
        for (float element: numbers){
            sum = sum + element;
        }
        System.out.println("The sum is " +sum);
    }
}
