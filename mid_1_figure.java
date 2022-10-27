package com.company;
class figure{
     static void area(){
        System.out.println("Hello");
    }
}
class rectangle extends  figure{

    static void area(){
        double x = 5;
        double y = 10;
        System.out.println(x*y);
    }
}

class triangle extends  figure{

    static void area(){
        double x = 12;
        double y = 2;
        System.out.println(0.5*x*y);
    }
}
public class mid_1_figure {
    public static void main(String [] args){
        rectangle r1 = new rectangle();
        r1.area();
        triangle t1 = new triangle();
        t1.area();
    }
}
