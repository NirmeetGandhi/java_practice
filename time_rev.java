package com.company;
class AddTime{
    int h,m;
    AddTime(){

    }
    AddTime(int h ,int m){
        this.h = h;
        this.m = m;
    }
    void add(AddTime obj1 ,AddTime obj2){
        h = obj1.h + obj2.h;
        m = obj1.m + obj2.m;
        if (m>=60){
            h = h+1;
            m = m-60;
        }
        System.out.println(h);
        System.out.println(m);
    }
}
public class time_rev {

    public static void main(String[] args) {
        AddTime t2 = new AddTime(1,50);
        AddTime t3 = new AddTime(1,10);
        AddTime t1 = new AddTime();
        t1.add(t2,t3);
    }
}
