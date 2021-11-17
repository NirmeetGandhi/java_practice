package com.company;

class cylinder1 {
    private int radius;
    private int height;


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfArea() {
        return (2 * Math.PI * radius * height) + 2 * Math.PI * radius * radius;
    }

    public double Volume() {
        return Math.PI * radius * radius * height;
    }

    public cylinder1(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
}

    class Rectangle1{
        private int length;
        private int breadth;

        public Rectangle1() {
            this.length = 4;
            this.breadth = 5;
        }

        public int getLength() {
            return length;
        }

        public int getBredth() {
            return breadth;
        }

        public Rectangle1(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }
    }


public class practice_set9_all {
    public static void main(String[] args) {
//        cylinder1 cyl = new cylinder1();

        /* problem 1
        cyl.setHeight(45);
        System.out.println(cyl.getHeight());
        cyl.setRadius(23);
        System.out.println(cyl.getRadius());
            */

//        problem 2
        /*
        cyl.setHeight(3);
        cyl.setRadius(6);
        System.out.println(cyl.surfArea());
        System.out.println(cyl.Volume());
        */
         // problem 3
//        cylinder1 cyl = new cylinder1(2,4);
//        System.out.println(cyl.surfArea());
//        System.out.println(cyl.Volume());

//        problem 4
//        Rectangle1 r = new Rectangle1(12,56);
//        System.out.println(r.getLength());
//        System.out.println(r.getBredth());


    }
}
