package com.company;
class coordinatess{
    int x,y,z;
    coordinatess(){

    }
    coordinatess(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    coordinatess add(coordinatess obj1 , coordinatess obj2 , coordinatess obj3){
        coordinatess obj4 = new coordinatess();
        obj4.x = obj1.x + obj2.x + obj3.x;
        obj4.y = obj1.y + obj2.y + obj3.y;
        obj4.z = obj1.z + obj2.z + obj3.z;

        return obj4;
    }
    void show(){
        System.out.print(x+ " ");
        System.out.print(y+ " ");
        System.out.print(z+ " ");
    }
}
public class coordinates_Add {
    public static void main(String[] args) {
        coordinatess c2 = new coordinatess(1,2,3);
        coordinatess c3 = new coordinatess(1,2,3);
        coordinatess c4 = new coordinatess(1,2,3);
        coordinatess c1 = new coordinatess();
        c1 = c1.add(c2,c3,c4);
        c1.show();
    }

}
