package org.example;

public class L14_1_Inheritence_Punch extends L14_Inheritence_TataCar{

    String model = "Punch";
    int num = 4576;

    public void price(){
        System.out.println(543210);
    }

    public static void main(String[] args){
        L14_1_Inheritence_Punch obj = new L14_1_Inheritence_Punch();

        System.out.println(obj.brand);
        System.out.println(obj.model);
        System.out.println(obj.num);
        obj.horn();
        obj.color();
        obj.price();
    }
}
