package org.example;

public class L10_ClassesandObjects {

    public static void main(String[] args) {
        //creating an object of main class
        Main x = new Main();
        System.out.println(x.a);
        x.name("Purnima");
    }
 // IMP : Public methods need an Object to call but Static methods can be called without creating an object
}
