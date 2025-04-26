package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
         int a = 5;
         public void name(String n){
             System.out.println(n);
         }

         //L13_Encapsulation
         public static void main(String[] args){
             L13_Encapsulation obj = new L13_Encapsulation();
             obj.setName(15);
             System.out.println(obj.getName());
         }
    }
