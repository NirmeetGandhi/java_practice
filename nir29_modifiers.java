package com.company;

class myEmp{
    private int id;
    private String name;
   public void setName(String n){
       name  = n;
   }
   public String getName(){
       return name;
   }
   public void setId(int i){
       id = i;
   }
   public int getId(){
       return id;
   }

}
public class nir29_modifiers {
    public static void main(String[] args) {
        myEmp nirmeet = new myEmp();
//        nirmeet.id = 12;
//        nirmeet.name = "Nirmeet_Gandhi";
        nirmeet.setId(3);
        System.out.println(nirmeet.getId());
        nirmeet.setName("Nirmeet");
        System.out.println(nirmeet.getName());

    }
}
