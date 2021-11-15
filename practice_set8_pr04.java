package com.company;

class Ractangle{
    public int ractArea(int l,int w){
        return l*w;
    }
    public int ractPara(int l,int w){
        return 2*(l+w);
    }
}
public class practice_set8_pr04 {
    public static void main(String[] args) {
        Ractangle ract = new Ractangle();
        System.out.println("The area of Rectangle is "+ract.ractArea(2,3));
        System.out.println("The parameter of Rectangle is " + ract.ractPara(2,3));;

    }
}
