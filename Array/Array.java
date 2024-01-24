package Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] marks = {23,24,43,55,23,45,76,88,99};
        // String[] str = {"mohit", "rahul","sanjay","amit"};
        int[] array = new int[10];

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt() + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " - ");
        }

    }
    // int[] marks = {23,24,43,55,23,45,76,88,99};
    // int element = 40;
    // int i=0;
    // for(;i<9;i++){
    // if(element == marks[i]){
    // System.out.println(i);
    // break;
    // }
    // }
    // if(i==9){
    // System.out.println(-1);
    // }
}
