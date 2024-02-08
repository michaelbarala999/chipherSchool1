package Question;

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class mergearray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr1[] = { 3, 5, 6, 8, 12, 14 };
        int arr2[] = { 2, 6, 7, 12, 15, 18, 21, 22 };
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n = arr1.length + arr2.length;
        int[] arr3 = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        if (i < n1) {
            while (i < n1) {
                arr3[k] = arr1[i];
                k++;
                i++;
            }
        }
        if (j < n2) {
            while (j < n2) {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}