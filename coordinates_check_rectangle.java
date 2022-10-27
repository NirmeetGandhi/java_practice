package com.company;
class Rectangle123{
    double cx,cy;
    double h=1, w=1,area;
    Rectangle123(){
        System.out.println("Hello");
    }
    Rectangle123(double cx,double cy,double h ,double w){
        this.cx = cx;
        this.cy = cy;
        this.h = h;
        this.w = w;
    }
   boolean check(double x,double y){
       double xl = cx - (w/2);
       double xr = cx + (w/2);
       double yd = cx + (h/2);
       double yu = cx - (h/2);

       if (x<xr && x>xl && y>yd && y<yu){
           return true;
       }
       return false;
   }
   void area(){
       System.out.println("Area is " + h*w);
   }
}
public class coordinates_check_rectangle {
    public static void main(String[] args) {
//        Rectangle r = new Rectangle();
        Rectangle123 r1 = new Rectangle123(1,2,3,4);
        System.out.println(r1.check(0,0));
        r1.area();

    }
}
