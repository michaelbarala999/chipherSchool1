
/* package whatever //do not write package name here */

import java.io.*;

class A {
    int age;

    private void funPrivate() {
        System.out.println("i am private function");
    }

    public void fun() {
        System.out.println("i am from A class");
    }
}

class B extends A {
    public void fun2() {
        System.out.println("i am from B class");
    }
}

class C extends B {
    public void funC() {
        System.out.println("i am from C class");
    }
}

class singleleval {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.fun();
        B obj2 = new B();
        obj2.fun2();
        obj2.fun();
        C obj3 = new C();
        obj3.fun();
        obj3.fun2();
        obj3.funC();
    }
}