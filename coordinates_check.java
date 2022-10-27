package com.company;
class rect{
    double cx,cy,h,w,area;

    rect(){
    }
    rect(double cx,double cy,double h , double w){
        this.cx = cx;
        this.cy = cy;
        this.h = h;
        this.w = w;
    }
    boolean isTrue(double x , double y){
        double xl = cx - (w/2);
        double xr= cx  + (w/2);
        double yd = cy -  (h/2);
        double yu = cy + (h/2);

        if (x>xl && x<xr && y<yu && y>yd){
            return true;
        }
        return false;
    }
    void area(){
        System.out.println("Area is " + h*w);
    }
}

public class coordinates_check {
    public static void main(String[] args) {
        rect r2 = new rect(5,5,4,4);
        rect r1 = new rect();
        System.out.println(r2.isTrue(2,3));
        r2.area();
    }
}
