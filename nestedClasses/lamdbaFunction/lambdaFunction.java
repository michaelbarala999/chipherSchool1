/*package whatever //do not write package name here */

import java.io.*;
interface demo {
    
    void fun(int x,int y,String str);
    
    default void help(){
        System.out.println(" help");
    }
}
// class demochild implements demo{
//     public void fun(int x){
//         for(int i=0;i<x;i++){
//             System.out.println("hello");
//         }
//     }
// }


    //     = ()->{};
class GFG {
	public static void main (String[] args) {
// 		demochild d1 = new demochild();
// 		    d1.fun(5);
       demo d2 = (int x ,int y,String str )-> {
           for(int i=0;i<x;i++){
               System.out.println(str);
           }
           System.out.println(y);
       };
       
       d2.fun(5,6,"CSK");
        // d2.help();
	}
}