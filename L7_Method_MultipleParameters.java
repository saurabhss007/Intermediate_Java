package org.example;

public class L7_Method_MultipleParameters {

    static void division(String name, int cls, int marks) {
        System.out.println("Student name: " + name);
        System.out.println("Class: " + cls);
        if (marks >= 60) {
            System.out.println("Devision: 1st");
        } else if (marks < 60 && marks >= 50) {
            System.out.println("Devision: 2nd");
        } else if (marks < 50 && marks >= 33) {
            System.out.println("Devision: 3rd");
        } else {
            System.out.println("Fail");

        }
    }

    public static void main(String[] args){
        division("Saurabh", 4, 45);

    }

}
