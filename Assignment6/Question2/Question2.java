import java.util.Scanner;

class Circle{
	private double myX;
	private double myY;
	private double myDiameter;
	
	public Circle() {
		this.myX = 0;
		this.myY = 0;
		this.myDiameter = 100;
	}
	
	public void getRecord() {
		System.out.println("X coordinate is: "+myX);
		System.out.println("Y coordinate is: "+myY);
		
	}
	Scanner sc = new Scanner(System.in);
	public void setRecord( ) {
		System.out.println("Enter X coordinate is: ");
		myX = sc.nextDouble();
		System.out.println("Enter Y coordinate is: ");
		myY = sc.nextDouble();
		try {
		System.out.println("Enter the Diameter: ");
		myDiameter = sc.nextDouble();
		if(myDiameter<0) {
			throw new DiameterCannotBeNegative();
		  }
		}catch(DiameterCannotBeNegative e){
			System.out.println("Exception: "+e.getMessage());
		}
	}
}

class DiameterCannotBeNegative extends Exception{
	public DiameterCannotBeNegative() {
		System.out.println("Diameter should be always positive");
	}
	public String getMessage() {
		//System.out.println("Diameter cannot be negative");
		return "Diameter cannot be negative";
	}
}


public class Question2 {
	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   Circle obj = new Circle();
   obj.setRecord();
   obj.getRecord();
   
   
	}
}
