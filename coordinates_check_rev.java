package com.company;
class rect123{
    double cx,cy,h,w,area;
    rect123(){
    }
    rect123(double cx,double cy,double h ,double w){
        this.cx = cx;
        this.cy = cy;
        this.h = h;
        this.w = w;
    }
    void area(){
        System.out.println("Area is " + h*w);
    }
    boolean isCheck(double x ,double y){
        double xl = cx - (w/2);
        double xr = cx + (w/2);
        double yd = cy - (h/2);
        double yu = cy - (h/2);

        if (x<xr && x>xl && y>yd && y<yu){
            return true;
        }
        return false;
    }
}
public class coordinates_check_rev {
    public static void main(String[] args) {
        rect123 r = new rect123();
        rect123 r1 = new rect123(1,2,3,4);
        System.out.println(r1.isCheck(0.2,0.1));
        r1.area();
    }
}
