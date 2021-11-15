package com.company;

//custom class
class Employee{
    int id;
    String name;
    // method created in custom class
    public void printData(){
        System.out.println("The id is "+ id);
        System.out.println("The name is "+name);
    }
}
public class nir19_custom_class {
    public static void main(String[] args) {
        Employee Nirmeet = new Employee(); // instaniating  a new object from Employee class

        //Setting properties(Attributes)
        Nirmeet.id= 12;
        Nirmeet.name = "Nirmeet_Gandhi";

        //but now we have created a method in Employee class so instead of writing sout every time we can just call that method
        Nirmeet.printData();

        // printing the attributes
        System.out.println(Nirmeet.id);
        System.out.println(Nirmeet.name);


    }
}
