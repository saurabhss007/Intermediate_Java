package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class L9_Recursion {

    //A recursive method has two key parts:
    //Base Case: This stops the recursion when the problem becomes simple enough to solve directly.
    //Recursive Case: This is where the method calls itself with modified arguments to gradually break the problem down.

    //Write a Program to find factorial a given number
    static int factorial(int a){
        if(a == 0 || a == 1){
            return 1;
        }
        else{
            return a * factorial(a -  1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find Factorial: ");
        int f = sc.nextInt();
        System.out.println(factorial(f));
    }
}
