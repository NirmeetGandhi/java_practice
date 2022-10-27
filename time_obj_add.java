package com.company;
class time_Addition{
    int h,m;
    time_Addition(){

    }
    time_Addition(int h,int m){
        this.h = h;
        this.m = m;
    }
    void add(time_Addition obj1,time_Addition obj2){
        h = obj1.h + obj2.h;
        m = obj1.m + obj2.m;

        if (m>=60){
            h = h +1;
            m = m-60;
        }
        System.out.print(h + " " + m);
    }
}
public class time_obj_add {
    public static void main(String[] args) {
        time_Addition t2 = new time_Addition(2,55);
        time_Addition t3 = new time_Addition(1,5);
        time_Addition t1 = new time_Addition();
        t1.add(t2,t3);
    }
}
