package Question;

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Demo {
    public int age;
    private int rollNo;
    private String name;

    public void Set_details(int x, int y, String s) {
        age = x;
        rollNo = y;
        name = s;
    }

    public void get_details() {
        System.out.println("age : " + age);
        System.out.println("RollNo : " + rollNo);
        System.out.println("name :" + name);
    }
}

class question2 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.Set_details(22, 2002, "mohit");
        obj.get_details();
    }
}