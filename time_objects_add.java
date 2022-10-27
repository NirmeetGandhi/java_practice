package com.company;
class Time{
    int h,m;
    Time(){
        System.out.println("HI");
    }
    Time(int h,int m){
        this.h = h;
        this.m = m;
    }
    void add_time(Time obj1,Time obj2){
        h = obj1.h + obj2.h;
        m = obj1.m + obj2.m;

        while (m>=60){
            h = h +1;
            m = m-60;
        }
        System.out.println(h);
        System.out.println(m);
    }
}
public class time_objects_add {
    public static void main(String[] args) {
        Time t2 = new Time(1,40);
        Time t3 = new Time(2,20);
        Time t1 = new Time();
        t1.add_time(t2,t3);

    }
}
