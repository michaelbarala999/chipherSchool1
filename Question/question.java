package Question;
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0 && array[i] % 3 == 0) {
                System.out.print("FizzBuzz");
            } else if (array[i] % 2 == 0) {
                System.out.print("Fizz");
            } else if (array[i] % 3 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(array[i]);
            }
        }
    }
}