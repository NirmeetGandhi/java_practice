package com.company;

class cylinder{
    private int radius;
    private int height;
//    private int sur;
    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }
    public double cylSurphase(){
        return (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
    }
    public double cylArea(){
        return  Math.PI*radius*radius*height;
    }
}
public class practice_set9_pr01 {
    public static void main(String[] args) {
        cylinder cl = new cylinder();
        cl.setRadius(23);
        cl.setHeight(23);
        System.out.println("The Surface of cylinder is "+ cl.cylSurphase());
        System.out.println("The area of Cylinder is "+cl.cylArea());

    }
}
