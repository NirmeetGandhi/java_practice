package com.company;

class emp{
    private int id;
    private String name;

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
public class accesee_modifiers_1 {
    public static void main(String[] args) {
        emp nir = new emp();
//        nir.id = 12; these two lines will throw an error due to private access modifier
//        nir.name = "Nirmeet";

        nir.setId(12);
        System.out.println(nir.getId());
        nir.setName("Nirmeet");
        System.out.println(nir.getName());
    }
}
