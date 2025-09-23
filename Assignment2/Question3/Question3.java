import java.util.Scanner;

 class Date {
    private int month;
    private int day;
    private int year;
    
    Scanner sc = new Scanner(System.in);
    
    public Date(int month,int day,int year) {
    	this.month = month;
    	this.day = day;
    	this.year = year;
    }
    
    public Date() {
    	
    }
    
    public void setRecord( ) {
    	System.out.println("Enter the day: ");
    	day = sc.nextInt();
    	System.out.println("Enter the month: ");
    	month = sc.nextInt();
    	System.out.println("Enter the year: ");
        year = sc.nextInt();
    }
    
    public void getRecord( ) {
    	System.out.println("DAY: "+day);
    	System.out.println();
    	System.out.println("Month: "+month);
    	System.out.println();
    	System.out.println("Year: "+year);
    }
    
    public void displayDate( ) {
    	System.out.println(day+"/"+month+"/"+year);
    }
    
}

public class Question3{
	public static void main(String[] args) {
		Date date = new Date();
		date.setRecord();
		date.getRecord();
		date.displayDate();
	}
}
