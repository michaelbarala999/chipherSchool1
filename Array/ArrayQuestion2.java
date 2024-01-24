public class ArrayQuestion2 {
    
}
/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] arr  = {2,5,7,9,234,46,24,45,4};
		int element = 9;
	//	boolean flag = false;
		int flag1 =0;
		for(int i=0;i<arr.length;i++){
		    if(arr[i] == element){
		        System.out.println(i);
		      //  flag = true;
		         flag1 = 1;
		    }
		}
// 		if(flag == false){
// 		    System.out.println(-1);
// 		}
         if(flag1 == 0){
             System.out.println(-1);
         }
		
	}
}