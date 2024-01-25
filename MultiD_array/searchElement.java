package MultiD_array;

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class searchElement {
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
        int element = 1;
        int flag = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == element) {
                    System.out.println("yes");
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("noo");
        }

    }
}
