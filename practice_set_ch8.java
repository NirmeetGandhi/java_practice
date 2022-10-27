package com.company;
 class myEmployee{
     int salary;
     String name;
     public int getSalary(){
         return salary;
     }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
 }
 class cell{
     public void ring(){
         System.out.println("Ringing...");
     }
     public void vibrate(){
         System.out.println("Vibrating...");
     }
 }
public class practice_set_ch8 {
    public static void main(String[] args) {
        //problem 1
        myEmployee nir = new myEmployee();
        nir.salary = 50;
        System.out.println(nir.getSalary());
        nir.setName("Nirmeet");
        System.out.println(nir.getName());

        //problem 2
        cell obj = new cell();
        obj.ring();
        obj.vibrate();
    }
}
