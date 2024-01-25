public class array.question3 {
    
}/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // 200 45 65 78 345 67 34
        // int min = arr[0];
        int min = Integer.MAX_VALUE;
        // INT_MAX INT_MIN
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("minimun no.is : " + min);
        System.out.println("maximum no.is : " + max);

    }
}
