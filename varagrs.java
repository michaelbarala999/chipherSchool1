/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static void fun(int... varagrs){
        System.out.println(varagrs.length);
        // for(int a : varagrs){
        //     System.out.println(a);
        // }
    }
        static void fun2(int[] x){
            System.out.println(x.lenggth);
        }
	public static void main (String[] args) {
		fun(1,2,3,6,8,9);
		fun2({3,4,6,7,8});
	}
}