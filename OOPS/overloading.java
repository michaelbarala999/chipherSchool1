
/*package whatever //do not write package name here */

import java.io.*;

class Demo {
    public int x;
    public int y;

    void mul() {
        System.out.println(0);
    }

    void mul(int val) {

        System.out.println(val);

    }

    void mul(int val, int val2) {
        System.out.println(val * val2);
    }

    void mul(int val, int val2, int val3) {
        System.out.println(val * val2 * val3);
    }
}

class overloading {

    public static void main(String[] args) {
        Demo obj1 = new Demo();
        obj1.mul(7, 9, 2);
    }
}