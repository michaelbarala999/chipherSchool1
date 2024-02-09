package Question;

/*package whatever //do not write package name here */

import java.io.*;

class leftRightMax {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 3, 4, 6, 12, 4, 13, 11, 10 };
        int n = arr.length;
        int left[] = new int[n];
        left[0] = arr[0];
        int right[] = new int[n];
        right[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            if (arr[i] > left[i - 1]) {
                left[i] = arr[i];
            } else {
                left[i] = left[i - 1];
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > right[i + 1]) {
                right[i] = arr[i];
            } else {
                right[i] = right[i + 1];
            }
        }
        System.out.print("leftMax Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(left[i] + " ");
        }
        System.out.print("RightMax Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(right[i] + " ");
        }

    }
}
