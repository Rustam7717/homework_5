package com.company;

import java.awt.*;

public class Car {
    int volume;
    double price;
    String model;
    Color color;


    public Car() {

    }

    public Car(int volume, double price, String model) {
        this.volume = volume;
        this.price = price;
        this.model = model;

    }

    public Car(int volume, String model) {
        this.volume = volume;
        this.model = model;

    }

    public Car(double price, String model) {
        this.price = price;
        this.model = model;

    }

    public void makeBit() {
        System.out.println("Sold to Lot # 2");
    }

    public void makeBit(String Bit) {
        System.out.println(Bit);

    }


}

