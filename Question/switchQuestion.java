
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class switchQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        switch (str) {
            case "Monday": {
                System.out.println("Today is Monday");
                break;
            }
            case "Tuesday": {
                System.out.println("Today is Tuesday");
                break;
            }
            default: {
                System.out.println("invalid Input");

            }
            case "input": {
                System.out.println("input input");
            }
        }
    }
}