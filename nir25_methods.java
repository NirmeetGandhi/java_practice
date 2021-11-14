package com.company;

public class nir25_methods {
//    nir25_methods obj = new nir25_methods();
    static int logic(int y,int x) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = x-y;
        }
        return z;
    }
    public static void main(String[] args) {
        // SUPPOSE IF WE WANT USE THIS LOGIC MULTIPLE TIMES THEN WE CAN USE METHODS
//        nir25_methods obj = new nir25_methods();
        int a = 5;
        int b = 3;
        int z;
        z = logic(b,a);
//        z = obj.logic(b,a);

        // SUPPOSE IF WE ALSO WANT TO USE ANOTHER LOGIC MULTIPLE TIMES ALSO
        int a1 = 5;
        int b1 = 3;
        int c1;
        c1 = logic(a1,b1);
//        c1 = obj.logic(a1,b1);
        System.out.println(z);
        System.out.println(c1);

    }
}
