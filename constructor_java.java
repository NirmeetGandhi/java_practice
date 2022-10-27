package com.company;
class MyMainEmployee{
    private int id;
    private String name;
    MyMainEmployee(int id,String name){
        this.id = id;
        this.name = name;
    }
//    void setName(String name){
//        this.name = name;
//    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }
}
public class constructor_java {
    public static void main(String[] args) {
        MyMainEmployee m = new MyMainEmployee(1,"Nirmeet");
        System.out.println(m.getId());
        System.out.println(m.getName());
    }
}
