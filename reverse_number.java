package com.company;
import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int s =0;
//        int count = 0;

        while (n>0){
            r = n%10;
            s = (s*10)+r;
            n = n/10;
        }
        System.out.println(s);


    }

}
