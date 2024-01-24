/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] arr1 = {3,6,5,7,8};
		int[] arr2 = {4,7,67,6,34};
		
		for(int i=0; i<arr1.length;i++){
		    for(int j=0; j<arr2.length;j++){
		        if(arr1[i] == arr2[j]){
		            System.out.println(arr1[i]);
		        }
		    }
		}
		
		
		
         
		
	}
}