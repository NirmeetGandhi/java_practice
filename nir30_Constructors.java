package com.company;

import java.net.URL;

class mainEmp{
    private int id;
    private String name;

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
       return name;
    }
    public mainEmp(){
        id = 3;
        name  = "myName";
    }
    public mainEmp(int i,String myName){
        id = i;
        name  = myName;
    }
}
public class nir30_Constructors {
    public static void main(String[] args) {
        mainEmp nir = new mainEmp(3,"Nirmeet_Gandhi");

        // we can also do method overloading in constructor too , we have added two methods in line 19 and 23
        // but with different arguments so in the below case we have not given any arguments so it will automatically
        // take the below argument but if we pass arguments as we have set in method at line 23 that will automatically
        // take the above object that is on line 30. so we can do method overloading in constructors too.
        mainEmp nir1 = new mainEmp();
//        nir.setId(2);
        System.out.println(nir.getId());
        System.out.println(nir.getName());

    }
}
