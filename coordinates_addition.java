package com.company;
class coordinates2{
    int x,y,z;
    coordinates2(){

    }
    coordinates2(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    coordinates2 add(coordinates2 obj1 ,coordinates2 obj2 ,coordinates2 obj3){
        coordinates2 obj4 = new coordinates2();
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
public class coordinates_addition {
    public static void main(String[] args) {
        coordinates2 c2 = new coordinates2(1,2,3);
        coordinates2 c3 = new coordinates2(1,2,3);
        coordinates2 c4 = new coordinates2(1,2,3);

        coordinates2 c1 = new coordinates2();
        c1 = c1.add(c2,c3,c4);
        c1.show();
    }
}
