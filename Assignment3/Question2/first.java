package com.sunbeam;
import java.util.Scanner;

class first{
	private String AccountNo;
	private int begBal;
	private int charges;
	private int credits;
	private int creditAllowed;
	
	Scanner sc = new Scanner(System.in);
	
	public first( ) {
		this.AccountNo = " ";
		this.begBal=0;
		this.charges=0;
		this.credits = 0;
		this.creditAllowed = 0;
	}
	
	public void acceptRecord( ) {
		System.out.println("Enter account Number: ");
		AccountNo = sc.nextLine();
		System.out.println("Enter beginning balance: ");
		begBal = sc.nextInt();
		System.out.println("Enter charges: ");
		charges = sc.nextInt();
		System.out.println("Enter credits: ");
		credits = sc.nextInt();
		System.out.println("Enter credit allowed: ");
	    creditAllowed = sc.nextInt();	
	}
	
	public void printRecord( ) {
		System.out.println("Account Number: "+AccountNo);
		System.out.println("Begnning balance: "+begBal);
		System.out.println("Charges: "+charges);
		System.out.println("credits: "+credits);
		System.out.println("Credits Allowed: "+creditAllowed);
	}
	
	public void calculateBalance( ) {
		int num = begBal + charges - credits;
		if(num<=creditAllowed) {
			System.out.println("Credit Limit Exceeded!!");
		}else {
			System.out.println("Continue your banking with us...");
		}
	}
	
}

