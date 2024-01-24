
import java.io.*;

class Demo {
    public int x;
    private int z;
    public static int y;

    // setter function for private
    public void setZ(int val, int val2) {
        z = val;
        y = val2;

    }

    public static void fun() {
        // System.out.println(x);
        System.out.println("funnnnnn");
    }

    public void getZ() {
        System.out.println("value of z for this object :" + z);
    }
}

class setterGetter {
    public static void main(String[] args) {
        // Demo d1();
        Demo d1 = new Demo();

        d1.x = 133;
        d1.y = 122;
        Demo.y = 1000;
        System.out.println(Demo.y);
        Demo.fun();
        // System.out.println("value of x for this object :"+d1.x);
        // d1.z = 100;
        // d1.setZ(100,200);
        // System.out.println("value of z for this object :"+d1.z);
        // d1.getZ();
    }
}