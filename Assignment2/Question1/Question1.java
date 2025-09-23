import java.util.Scanner;
                                                
class invoice{
	private String partNo;
	private String partDes;
	private int quantity;
	private double price;
	
	Scanner sc = new Scanner(System.in);
	
	public invoice(String partNo,String partDes,int quantity,double price) {
		  this.partNo = partNo;
		  this.partDes = partDes;
		  if(quantity<0) {
		  this.quantity = 0;
		  }else {
		        this.quantity = quantity;
		  }
		  if(price<0) {
			  this.price = 0.0;
		  }else {
		  this.price = price;
		  }
	}
	
	public void setRecord(String partNo,String partDes,int quantity,double price) {
		System.out.println("Enter the part Number: ");
		this.partNo = sc.nextLine();
		System.out.println("Enter the part Description: ");
		this.partDes = sc.nextLine();
		System.out.println("Enter the Quantity: ");
		this.quantity = sc.nextInt();
		System.out.println("Enter the price: ");
		this.price = sc.nextDouble();
	}
	
	public void printRecord() {
		System.out.println(" part Number: "+partNo);
		System.out.println(" part Description: "+partDes);
		System.out.println(" Quantity: "+quantity);
		System.out.println(" Price: "+price);
	}
	
	
	public double getBill(double price,int quantity ) {
		double bill = price*quantity;
		return bill;
	}
}
public class Question1 {
	public static void main(String[] args) {
       invoice obj = new invoice("123","Hammer",10,100.0);
       //obj.setRecord("123","Hammer",10,100.0);
       obj.printRecord( );
	}
}
