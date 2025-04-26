package org.example;

public class L16_1_Abstraction extends L16_Abstraction{

    String model = "Tiago";


    public void horn() {
        System.out.println("Pooooo!");
    }

    public static void main(String[] args){
        L16_1_Abstraction obj = new L16_1_Abstraction();

        System.out.println(obj.brand + " " + obj.model );
        obj.horn();
    }

}
