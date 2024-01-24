
/*package whatever //do not write package name here */

import java.io.*;

class Demo {
    public int x;
    public int y;

    Demo(int val1, int val2) {
        x = val1;
        y = val2;
    }

    Demo() {
        System.out.println("hello");
    }
}

class firstClass {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo(12, 200);
        System.out.println(obj2.x);
        System.out.println(obj2.y);
    }
}