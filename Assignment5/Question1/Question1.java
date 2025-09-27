import java.util.Scanner;

public class Question1 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the String to be reversed: ");
	   String str = sc.next();
	   String ans = " ";
	  
	   for( int i=str.length()-1;i>=0;i--) {
		   ans+=str.charAt(i);
	   }
	   System.out.println("Reversed String is: "+ans);
	   sc.close();
   }
}
