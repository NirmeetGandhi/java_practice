package com.company;

class Circle{
    public double getSide(double r){
        r = Math.PI*r*r;
        return r;
    }
    public double getPara(double r){
        return 2*Math.PI*r;
    }
}
public class practice_set8_pr06 {
    public static void main(String[] args) {
        Circle cr = new Circle();
        System.out.println("The area of circle is "+cr.getSide(3));
        System.out.println("The Parameter of circle is "+cr.getPara(4));
    }
}
