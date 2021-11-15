package com.company;

class cellphone {
    public void calling(){
        System.out.println("Calling Diya...");
    }
    public void ringing(){
        System.out.println("Ringing! the phone");
    }
    public void vibrating(){
        System.out.println("Vibrating! the phone!");
    }
}
public class practice_set8_pr02 {
    public static void main(String[] args) {
        cellphone pr2 = new cellphone();
        pr2.calling();
        pr2.ringing();
        pr2.vibrating();
    }
}
