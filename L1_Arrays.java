package org.example;

public class L1_Arrays {
    public static void main(String[] args){
        //array declaration
        String[] weeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};

        //accessing array elements
        System.out.println(weeks[0]);

        //changing array elements
        weeks[0] = "Funday";

        for(int i = 0; i <= 6; i++) {
            System.out.println(weeks[i]);
        }

        System.out.println(weeks.length);
    }
}
