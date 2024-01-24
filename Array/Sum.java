package Array;

import java.io.*;
import java.util.*;

class Sum {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 8, 9, 12, 13, 7, 4 };
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == sum) {
                    System.out.println("{" + arr[i] + "," + arr[j] + "}");
                    System.out.println("yes");
                    flag = 1;

                }
            }
        }
        if (flag == 0) {
            System.out.println("NO");
        }
    }
}
