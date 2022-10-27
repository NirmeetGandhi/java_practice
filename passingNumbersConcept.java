package com.company;

public class passingNumbersConcept {
    static void  logic(int n){
        if(n==0){
            return;
        }
        logic(--n);
        System.out.println(n);
    }
    public static void main(String[] args) {
//        System.out.println(logic(5));
        logic(5);
    }
}
