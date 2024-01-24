package Array;

import java.io.*;

class duplicates {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 5, 5, 1, 2, 9, 12, 14, 23, 54, 12, 13 };
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    count++;
                }
            }
        }
        System.out.println("no. of duplicates : " + count);

    }
}