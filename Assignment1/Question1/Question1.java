import java.util.Scanner;

public class Question1 {
	public static void main(String args[]) {
     System.out.println("Enter an Integer: ");
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     System.out.println("Entered number: "+num);
     System.out.println("Binary Form: "+Integer.toBinaryString(num));
     System.out.println("Octal Form: "+Integer.toOctalString(num));
     System.out.println("Hexadecimal Form: "+Integer.toHexString(num));
     
	}
}
