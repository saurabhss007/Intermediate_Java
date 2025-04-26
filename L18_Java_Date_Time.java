package org.example;
import java.time.LocalTime;
import java.time.LocalDate;


public class L18_Java_Date_Time {
    //Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API. The package includes many date and time classes.
    public static void main(String[] args){
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDate date = LocalDate.now();
        System.out.println(date);
    }

}
