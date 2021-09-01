package com.company;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.volume = 470;
        car1.price = 16000;
        car1.model = "Lexus";

        System.out.println("Vehicle volume: " + car1.volume + " Price in invoice: " + car1.price + " Model :" + car1.model);

        Car car2 = new Car(570, "Lexus");
        System.out.println("Vehicle volume: " + car2.volume + " Model: " + car2.model);

        car2.makeBit();



        Car car3 = new Car (22000.0, "Lexus");
        System.out.println("Price in invoice: " + car3.price + " Model " + car3.model );

        car3.makeBit("Sold to Lot #1");

//        Car car4 = new Car(12000, "")




    }


}
