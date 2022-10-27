package com.company;

public class scoping {
    public static void main(String[] args) {
        int a = 45;
        int b = 65;
        System.out.println(a);
        // creating the block
        {
           a =415;
            System.out.println(b);
            System.out.println(a);
        }
        System.out.println(a);

    }
}
