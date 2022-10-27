package com.company;

class myMainEmp{
    private int id;
    private String name;

    public myMainEmp(){
        id = 12;
        name = "Nirmeet";
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class constructor {
    public static void main(String[] args) {
        myMainEmp e = new myMainEmp();
        //these 2 lines  are the o/p of constructor because it automatically invokes when we make an object
        System.out.println(e.getId());
        System.out.println(e.getName());

        e.setId(13);
        System.out.println(e.getId());
        e.setName("Nir");
        System.out.println(e.getName());


    }
}
