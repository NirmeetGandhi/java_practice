package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayListsssss {
    public static void main(String[]args){

//        ArrayList<Integer> ls = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <4 ; i++) {
            ls.add(new ArrayList<>());
        }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                ls.get(i).add(sc.nextInt());
            }
        }
        System.out.println(ls);
    }
}
