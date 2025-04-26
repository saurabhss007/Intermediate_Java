package org.example;

public class L12_ConsParameters {

    String phone;
    int ram, rom;

    public L12_ConsParameters(String a, int b, int c){
        phone = a;
        ram = b;
        rom = c;
    }

    public static void main(String[] args){
        L12_ConsParameters obj = new L12_ConsParameters("Samsung", 8, 128);

        System.out.println("My " + obj.phone + " Phone has " + obj.ram + "GB RAM and " + obj.rom  + "GB ROM");
    }

}
