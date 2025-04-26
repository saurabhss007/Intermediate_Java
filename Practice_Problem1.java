package org.example;

public class Practice_Problem1 {
    public static void main(String[] args){
        // write a program to find lowest age from the given age array

        int[] ages = {10,12,13,2,13,34,56};

        int lowest_age = ages[0];

        for(int i : ages){
            if(lowest_age > i){
                lowest_age = i;
            }
        }
        System.out.print("Lowest age in the given array is: " + lowest_age);

    }
}
