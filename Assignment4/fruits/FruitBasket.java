package com.app.fruits;

import java.util.Scanner;

public class FruitBasket{
   

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the basket Size: ");
    	int size =  sc.nextInt();
    	
    	Fruit[] Basket = new Fruit[size];
    	int counter = 0;
    	
    	boolean exit = false;
    	
    	while(!exit) {
    		System.out.println("\n--- Menu ---");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits");
            System.out.println("5. Display details of fresh fruits");
            System.out.println("6. Display tastes of stale fruits");
           // System.out.println("7. Mark a fruit as stale (by index)");
            System.out.println("7. Mark all sour fruits as stale");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            
    	    switch(choice) {
    	        case 0:
    	        	exit= true;
    	        	break;
    	        	
    	        case 1:
    	        	if(counter<size) {
    	        		System.out.println("Enter the Mango name,weight,color: ");
    	        		String nm = sc.next();
    	        		double wt = sc.nextDouble();
    	        		String clr = sc.next();
    	        		Basket[counter++] = new Mango(nm,wt,clr);
    	       	        }else {
    	       	        	System.out.println("Basket Full");
    	       	       }
    	        	break;
    	       
    	        case 2:
    	        	if(counter<size) {
    	        		System.out.println("Enter the Orange details:  ");
    	        		String nm = sc.next();
    	        		double wt = sc.nextDouble();
    	        		String clr = sc.next();
    	        		Basket[counter++] = new Orange(nm,wt,clr);
  
    	        	}else {
    	        		System.out.println("Basket Full");
    	        	}
    	        	break;
    	        
    	        case 3:
    	        if(counter<size) {
	        		System.out.println("Enter the Apple details:  ");
	        		String nm = sc.next();
	        		double wt = sc.nextDouble();
	        		String clr = sc.next();
	        		Basket[counter++] = new Apple(nm,wt,clr);

	        	}else {
	        		System.out.println("Basket Full");
	        	}
	        	break;
	        	
    	        case 4:
    	        	System.out.println("\nFruits in basket:");
    	        	for(Fruit f:Basket) {
    	        		if(f!=null) {
    	        			System.out.println(f.getName());
    	        		}
    	        	}
    	           break;
    	           
    	        case 5:
    	        	System.out.println("\nFresh fruits:");
                    for (Fruit f : Basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f.toString() + ", Taste: " + f.taste());
                        }
                    }
                    break;
    	     
    	        case 6:
    	        	System.out.println("\nStale fruits:");
                    for (Fruit f : Basket) {
                        if (f != null && !f.isFresh()) {
                            System.out.println(f.getName() + " taste: " + f.taste());
                        }
                    }
                    break;
                    
    	        case 7:
    	        	 for (Fruit f : Basket) {
                         if (f != null && f.taste().equals("sour")) {
                             f.setFresh(false);
                         }
                     }
                     System.out.println("All sour fruits marked stale.");
                     break;
                     
                default:
                	System.out.println("Invalid choice");
    	        	
    	    }
    	}
    	sc.close();
    	System.out.println("GoodBye!!");
    }
}
