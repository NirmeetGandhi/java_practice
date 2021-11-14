package com.company;

public class practice_set5_pr05 {
    public static void main(String[] args) {
        //FINDS THE FACTORIAL OF A NUMBER USING WHILE LOOP
        int n = 3;
        int i=1;
        int fact = 1;
        while (i<=n){
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
}
