package org.example;


import java.util.Scanner;

public class L4_UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the username: ");
        String name = sc.nextLine();
        System.out.println("Given username is: " + name);

    }

}
