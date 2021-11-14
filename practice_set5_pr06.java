package com.company;

public class practice_set5_pr06 {
    public static void main(String[] args) {

        //FINDS THE FACTORIAL OF A NUMBER USING FOR LOOP
        int n =3;
//        int i =1;
        int fact = 1;

        for (int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println("The factorial is:"+fact);
    }
}
