package com.company;

class circle{
    private int radius;
    private int area;
    private int para;

    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public void setArea(int a){
        area = a;
//        if (area<radius){
//            System.out.println("INVALID area");
//        }
//        else {
//            System.out.println(area);
//        }
    }
    public int getArea(){
        return area;
    }
    public void setPara(int p){
        para = p;
//        if (para<radius){
//            System.out.println("INVALID para");
//        }
//        else {
//            System.out.println(para);
//        }
    }
    public int getPara(){
        return para;
    }
}
public class Exercise_modifiers {
    public static void main(String[] args) {
        circle cr = new circle();
        cr.setRadius(2);
        cr.setArea(1);
        cr.setPara(4);
        System.out.println(cr.getRadius());
        System.out.println(cr.getArea());
        System.out.println(cr.getPara());
    }
}
