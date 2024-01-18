/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
