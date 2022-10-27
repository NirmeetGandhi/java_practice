package com.company;
class rectee{
    double width;
    double height;
    rectee(){
        width = 1;
        height = 1;
    }
    rectee(double height,double width){
        this.height = height;
        this.width = width;
    }
    double getArea(){
        return height*width;
    }
    double patimeter(){
        return 2*height*width;
    }

}
public class mid_program {
    public static void main(String [] args){
        rectee r = new rectee();
        rectee r1 = new rectee(2,3);
        System.out.println(r1.getArea());
        System.out.println(r1.patimeter());
    }
}
