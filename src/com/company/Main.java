package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Car, InfoAboutCar> cars = new HashMap<>(Map.of(
             new Car(1545,555), new InfoAboutCar(2021, "Hyundai",36000,"White"),
             new Car(4810,524), new InfoAboutCar(2002, "Toyota",23000,"Yellow"),
             new Car(4563,963), new InfoAboutCar(2014, "Lexus",58000,"Grey"),
             new Car(6545,888), new InfoAboutCar(2020, "Honda",9000,"Blue"),
             new Car(2010,779), new InfoAboutCar(1989, "Mercedes",25000,"Red")));


        for (Map.Entry a: cars.entrySet()) {
            System.out.println(a.getKey() + " " + a.getValue());
        }
    }
}
