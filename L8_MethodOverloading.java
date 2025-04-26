package org.example;

public class L8_MethodOverloading {

    public static int addition(int a, int b){
        return a + b;

    }
    public static float addition(float a, float b){
        return a + b;
    }

    public static double  addition(double a, double b, String name){
        System.out.println("name: " + name);
        return a + b;

    }

    public static void main(String[] args){
        System.out.println(addition(1,2));
        System.out.println(addition(1.2F, 2.3F));
        System.out.println(addition(1.2, 2.3, "Saurabh"));
    }
}

