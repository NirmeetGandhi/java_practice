package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class rev_multidimensional_AL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);

    }
}
