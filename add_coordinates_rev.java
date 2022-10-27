package com.company;
class coordinates1{
int x,y,z;
    coordinates1(){

    }
    coordinates1(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    coordinates1 add_coordinates1(coordinates1 obj1,coordinates1 obj2,coordinates1 obj3){
        coordinates1 obj4 = new coordinates1();
        obj4.x = obj1.x + obj2.x + obj3.x;
        obj4.y = obj1.y + obj2.y + obj3.y;
        obj4.z = obj1.z + obj2.z + obj3.z;

        return obj4;
    }
    void show(){
        System.out.print(x + " ");
        System.out.print(y + " ");
        System.out.print(z + " ");
    }
}
public class add_coordinates_rev {
    public static void main(String[] args) {
        coordinates1 c2 = new coordinates1(1,2,3);
        coordinates1 c3 = new coordinates1(1,2,3);
        coordinates1 c4 = new coordinates1(1,2,3);

        coordinates1 c1 = new coordinates1();
        c1 = c1.add_coordinates1(c2,c3,c4);
        c1.show();

    }
}
