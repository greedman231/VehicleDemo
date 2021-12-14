package com.company;

public class VehicleDemo {

    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        car1.passangers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;

        double distance = car1.maxspeed * 0.5;
        System.out.println("За 30 минут car1 проедет" + distance + "км");
    }
}
