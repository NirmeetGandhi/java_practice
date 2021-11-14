package com.company;

public class nir16_logical {
    public static void main(String[] args) {
        System.out.println("Welcome");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        // with the rule of assosiativity(left to right) it will first do and operation between a and b(a && b) and
        // after that it will perform the OR operation betweeen the output of a && b with c so the output of a && b is
        // fasle and false with c means OR operation between flase || c will return true so output will be true in this
        // case
//        logical and operator
        if (a && b || c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
//        logical or operator
//        boolean a = true;
//        boolean b = false;
//        if(a || b){
//            System.out.println("Y");
//        }
//        else {
//            System.out.println("N");
//        }

//        logical and operator
//        boolean a = true;
        System.out.println(!a);
    }
}
