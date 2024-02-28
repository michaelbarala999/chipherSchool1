
/*package whatever //do not write package name here */

import java.io.*;

interface car {
    void breakingSystem(); // public

    void oilingSystem();

    // int tyre = 4; not allowed
    int tyre = 12;

    // final int tyre = 4;
}

interface indianCar {
    void pollution();

    void drivingSide();

    void oilingSystem();
}

class BMW implements indianCar, car {
    public void breakingSystem() {
        System.out.println(" car should have good breaking system");
    }

    public void drivingSide() {
        System.out.println(" you have to drive left side");
    }

    public void pollution() {
        System.out.println("you shuold have polution slip");
    }

    public void oilingSystem() {
        System.out.println("oiling system should be there");
    }

}

class Audi implements indianCar, car {
    /// agian we have to override all abstract method
}

class interface2 {
    public static void main(String[] args) {
        BMW b1 = new BMW();
        b1.pollution();

        System.out.println(b1.tyre);
    }
}