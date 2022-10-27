package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(23);
//        list.add(22);
//        list.add(2323);
//        list.add(2323);
//        list.add(233);
//        list.add(233);
//        System.out.println(list.contains(22));
//        System.out.println(list);
//        list.set(0,43);
//        System.out.println(list);

        for (int i=0;i<10;i++){
            list.add(sc.nextInt());
        }

//        for (int a: list) {
//            System.out.print(a + " ");
//        }

        for (int i=0;i<10;i++){
            System.out.print(list.get(i) + " ");
        }
//        for (int i = 0; i <5 ; i++) {
//            list.add(sc.nextInt());
//        }
//        for (int i = 0; i <5 ; i++) {
//            System.out.print(list.get(i)+ " 1");
//        }

//        for (int l:list) {
//            System.out.println(l);
//        }
    }
}
