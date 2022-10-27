package com.company;
class time1{
    int h,m;
    time1(){

    }
    time1(int h , int m){
        this.h = h;
        this.m = m;
    }
    void add(time1 obj1,time1 obj2){
        h = obj1.h + obj2.h;
        m = obj1.m + obj2.m;

        if (m>=60){
            h = h +1;
            m = m -60;
        }
        System.out.println(h);
        System.out.println(m);
    }
}
public class rev_time_obj {
    public static void main(String[] args) {
        time1 t2 = new time1(1,40);
        time1 t3 = new time1(1,20);
        time1 t1 = new time1();
        t1.add(t2,t3);
    }

}
