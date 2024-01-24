public class multiD_array {

}
/* package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(arr[0].length); // for column
        System.out.println(arr.length); // row
        // for(int i=0; i<3;i++){
        // for(int j=0; j<2;j++){
        // System.out.print(arr[i][j]+" ");
        // }
        // System.out.println();
        // }
    }
}