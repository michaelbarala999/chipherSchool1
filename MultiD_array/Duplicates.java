package MultiD_array;

import java.io.*;
import java.util.*;

class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int mat[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int max = 13;
        int arr[] = new int[max + 1];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[mat[i][j]] = arr[mat[i][j]] + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                System.out.println(i);
            }
        }

    }
}