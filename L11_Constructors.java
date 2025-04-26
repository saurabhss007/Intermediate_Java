package org.example;

//the constructor name must match the class name, and it cannot have a return type (like void).
//
//Also note that the constructor is called when the object is created.
//
//All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.

public class L11_Constructors {

    String name;

    public L11_Constructors(){
        name = "Saurabh";

    }

    public static void main(String[] args){
        L11_Constructors a = new L11_Constructors();

        System.out.println(a.name);
    }
}

