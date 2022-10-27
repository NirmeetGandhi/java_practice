package com.company;
class coordinates{
    int x,y,z;
    coordinates(){
        System.out.println("HI");
    }
    coordinates(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    coordinates add_coordinates(coordinates obj1 ,coordinates obj2,coordinates obj3){
        coordinates obj4 = new coordinates();
        obj4.x = obj1.x + obj2.x + obj3.x;
        obj4.y = obj1.y + obj2.y + obj3.y;
        obj4.z = obj1.z + obj2.z + obj3.z;

        return obj4;
    }
    void show(){
        System.out.print(x+ " ");
        System.out.print(y + " ");
        System.out.print(z + " ");
    }
}
public class add_coordinates {
    public static void main(String[] args) {
        coordinates c2 = new coordinates(1,2,3);
        coordinates c3 = new coordinates(1,2,3);
        coordinates c4  = new coordinates(1,2,3);

        coordinates c1 = new coordinates();
        c1 = c1.add_coordinates(c2,c3,c4);
        c1.show();
    }
}
