package org.example;

public class L13_Encapsulation {
//    declare class variables/attributes as private
//provide public get and set methods to access and update the value of a private variable
     private int i = 11;
// private variables can only be accessed withing the declared class
     public int getName(){
        return i;
     }

     public void setName(int a){
         this.i = a;

     }
    public static void main(String[] args){
        L13_Encapsulation obj = new L13_Encapsulation();
        obj.setName(10);
        System.out.println(obj.getName());
        obj.setName(11);
        System.out.println(obj.getName());
    }
}
