import java.util.Scanner;

public class continueBreak {
public static void main (String[] args) {
	// Break and continue
	Scanner in = new Scanner(System.in);
	int x = 5;
	int i=1;
// 	for(; i<10;i++){
// 	    System.out.println(i*x);
// 	    if(i==5){
// 	        break;
// 	    }
// 	    i++;
	   
// 	}
   for(;i<4;i++){                  // 1 1 2 3 3
       System.out.println(i);
       if(i==2){
           continue;
           System.out.println("hello");
       }
       System.out.println(i);
   }
//	System.out.println(i);
	
	}
    
}
