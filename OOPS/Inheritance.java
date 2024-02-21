
/*package whatever //do not write package name here */

import java.io.*;

class Base {
    public int data;
    private String name;

    Base(int x, String str) {
        data = x;
        name = str;
    }

    Base() {

    }

    public void baseDetails() {
        System.out.println("name : " + name);
    }

}

class Child extends Base {
    public int age;
    private String school;

    Child(int x, String str, int y, String str2) {
        super(y, str2);
        age = x;
        school = str;
    }

    Child() {

    }

    public void childDetails() {
        super.baseDetails();
        System.out.println("data : " + data);
        System.out.println("age : " + age);
        System.out.println("school : " + school);
    }
}

class Inheritance {
    public static void main(String[] args) {
        // Base b1 = new Base();
        Child c1 = new Child(23, "abc school", 10, "rahul");
        c1.childDetails();

    }
}