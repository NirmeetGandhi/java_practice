package com.company;
class check{
    double cx,cy,h,w,area;
    check(){

    }
    check(double cx,double cy,double h,double w){
        this.cx = cx;
        this.cy = cy;
        this.h = h;
        this.w = w;
    }
    boolean check(double x ,double y){
        double xl = cx - (w/2);
        double xr = cx + (w/2);
        double yd = cy - (h/2);
        double yu = cy + (h/2);

        if (x<xr && x>xl && y>yd && y<yu){
            return true;
        }
        else{
            return false;
        }
    }
    void area(){
        System.out.println("Area is " + h*w);
    }
}
public class check_coordinates {
    public static void main(String[] args) {
        check c2 = new check(3,3,1,1);
//        check c1 = new check();
        System.out.println(c2.check(0.2,0.1));
        c2.area();
    }
}
