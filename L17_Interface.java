package org.example;


//An interface is a completely "abstract class" that is used to group related methods with empty bodies:
//To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class

//Creating Interface
interface Animal{
    void sound();
    void sleep();

}
public class L17_Interface implements Animal {


    public void sleep() {
        System.out.println("Zzzz...");
    }

    public void sound() {
        System.out.println("Bhau Bhau!!");
    }

    public static void main(String[] args){
        L17_Interface obj = new L17_Interface();

        obj.sleep();
        obj.sound();
    }
}
//Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
//Interface methods do not have a body - the body is provided by the "implement" class
//On implementation of an interface, you must override all of its methods
//Interface methods are by default abstract and public
//Interface attributes are by default public, static and final
//An interface cannot contain a constructor (as it cannot be used to create objects)