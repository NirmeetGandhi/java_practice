package com.company;

public class nir25_test_methods {
    int nir(int a,int b) {
        int c;
        if (a > b) {
            c = a + b;
        } else {
            c = a - b;
        }
        return c;
    }
    public static void main(String[] args) {
        nir25_test_methods obj = new nir25_test_methods();
        int a = 7;
        int b = 6;
        int c;
         c = obj.nir(a,b);

        System.out.println(c);
    }

}
