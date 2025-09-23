import java.util.Scanner;

public class Question2 {
	
       public static void  main(String args[]) {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter number 1:");
    	   
    	   if(sc.hasNextDouble()) {
    		   double num1 = sc.nextDouble();
    		   
    		   System.out.println("Enter number 2:");
    		   if(sc.hasNextDouble()) {
    			   double num2 = sc.nextDouble();
    			   double ans = (num1+num2)/2;
    			   System.out.println("Answer is:"+ans);
    			   return;
    		   }
    	   }
       
       System.out.println("ERROR");

    }
}
