import java.util.Scanner;

class ExceptionLineTooLong extends Exception{
	public ExceptionLineTooLong() {
		System.out.println("String to long..");
	}
}

public class Question1 {
   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st = sc.next();
		
		try {
			if(st.length()>80) {
				throw new ExceptionLineTooLong();
			}
			else {
				System.out.println("Length of String: "+st.length());
			}
		}catch(ExceptionLineTooLong e) {
			System.out.println("Error: "+e.getMessage());
		}
		
	}
	
}
