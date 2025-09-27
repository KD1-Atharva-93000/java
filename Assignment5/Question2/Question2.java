import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be checked: ");
 	   String str = sc.next();
 	   String ans = "";
 	  
 	   for( int i=str.length()-1;i>=0;i--) {
 		   ans+=str.charAt(i);
 	   }
 	  //System.out.println("String reversed: "+ans);
 	   if(str.equals(ans)) {
 	   System.out.println("String is Palindrome ");
 	   }else {
 		  System.out.println("String is not Palindrome"); 
 	   
    }
 	  sc.close();
	}

}
