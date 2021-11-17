package com.company;

class sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surphaseArea(){
        return 4*Math.PI*radius*radius;
    }
    public double volume(){
        return (4*Math.PI*radius*radius*radius)/3;
    }
}
public class practice_set9_pr05 {
    public static void main(String[] args) {
        sphere s = new sphere();
        s.setRadius(3);
        System.out.println(s.getRadius());
        System.out.println("The surface area of sphere is "+s.surphaseArea());
        System.out.println("The volume of spherer is "+ s.volume());

    }
}
