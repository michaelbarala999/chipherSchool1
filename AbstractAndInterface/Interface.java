
/*package whatever //do not write package name here */

import java.io.*;

interface Parent {
    void fun();
}

interface child1 extends Parent {
    void fun1();
}

interface child2 extends Parent {
    void fun2();
}

class grandChild implements child2, child1 {
    public void fun() {
        System.out.println("hello i am fun");
    }

    public void fun1() {
        System.out.println(" i am from child 1");
    }

    public void fun2() {
        system.out.println(" i am from child2");
    }

}

class Interface {
    public static void main(String[] args) {
        grandChild g1 = new grandChild();
        g1.fun();
    }
}