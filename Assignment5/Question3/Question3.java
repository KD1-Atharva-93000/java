import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to be checked: ");
		String str = sc.next();
		str = str.trim();
		
		String[] words = str.split(" ");
		int cnt = words.length;
		System.out.println("String length: "+cnt+1);
		
		
		
		
		sc.close();
	}

}
