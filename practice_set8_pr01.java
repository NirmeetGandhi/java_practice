package com.company;

import com.sun.source.tree.BreakTree;

class Employee1{
    int salery;
    String name;
    public int getSalery(){
        return salery;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;

    }

}
public class practice_set8_pr01 {
    public static void main(String[] args) {
        Employee1 nirmeet = new Employee1();

        nirmeet.setName("Nirmeet");
        System.out.println(nirmeet.getName());

//        nirmeet.salery = 23;
//        nirmeet.name = "Nirmeet_Gandhi";
//        System.out.println(nirmeet.getSalery());
//        System.out.println(nirmeet.getName());

    }
}
