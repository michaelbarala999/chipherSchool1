
/* package whatever //do not write package name here */

import java.io.*;

class Car {
    public int wheel;
    public String color;
    public int price;

    public void breakFunction() {
        System.out.println("i am breaking system");
    }

}

class SuperCar extends Car {
    String MusicSystem;

    public void power() {
        System.out.println("i am power function for supercar");
    }
}

class SimpleCar extends Car {
    int airbag;

    void safety() {
        System.out.println("i am safety function in simple car");
    }
}

class singlelevel {

    public static void main(String[] args) {
        SuperCar s1 = new SuperCar();
        SimpleCar s2 = new SimpleCar();

    }
}