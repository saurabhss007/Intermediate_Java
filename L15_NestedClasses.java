package org.example;

public class L15_NestedClasses {
    int age = 24;
    //it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.

    //Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private

    //An inner class can also be static, which means that you can access it without creating an object of the outer class

    class InnerClass{
        String name = "Saurabh";

        public void mymethod(){
            System.out.println("My Name is " + name + " and my age is "  + age);
        }
    }

    public static void main(String[] args){
        //creating object of outer class
        L15_NestedClasses objOuter = new L15_NestedClasses();

        //creating object of inner class
        L15_NestedClasses.InnerClass objInner = objOuter.new InnerClass();

        objInner.mymethod();

    }
}
