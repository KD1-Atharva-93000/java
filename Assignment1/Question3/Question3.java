import java.util.Scanner;

public class Question3 {
        public static void main(String args[]) {
        	Scanner sc = new Scanner(System.in);
        	String[] items = {"Dosa","Misal","Vada-Pav","Idli","Pohe","Upma","Samosa"};
        	double[] prices = {100,80,20,30,20,20,15};
        	
        	double totalBill = 0;
        	int quantity;
        	int choice;
        	do {
        	for(int i=0;i<items.length;i++) {
        		System.out.println("Food Item: "+items[i]+" Prices: "+prices[i]);
        	}
        	System.out.println("Enter 10 to generate the Bill");
        	
        	System.out.println("Enter the Choice for food items: ");
        	choice = sc.nextInt();
        	if(choice>=1 && choice<=9) {
        		System.out.println("Enter Quantity: ");
        		quantity = sc.nextInt();
        		totalBill = prices[choice-1]*quantity;
        		
        	}
        	else if(choice==10) {
        		System.out.println("Total Bill Of quantity is"+totalBill);
        	}
        	else {
        		System.out.println("Invalid Choicec please try again");
        	}
        	
        	}while(choice!=10);
        	
        	sc.close();
        	
        }
}
