
/* package whatever //do not write package name here */

import java.io.*;

class Demo {
    public int x;
    public int y;

    public Demo(int val1, int val2) {
        x = val1;
        y = val2;
        System.out.println("hello");
    }

    public Demo() {
        System.out.println("bye");
    }

    public Demo(int val) {
        x = val;
    }

}

class constructor {
    public static void main(String[] args) {
        Demo obj1 = new Demo(100, 200);
        Demo obj3 = new Demo();
        Demo obj2 = new Demo(300, 400);
        Demo obj4 = new Demo(800);
        // obj1.x = 100;
        // obj1.y = 200;
        // obj2.x = 300;
        // obj2.y = 400;
        System.out.println(obj4.y);
    }
}