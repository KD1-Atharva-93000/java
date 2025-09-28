package com.domain;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
public class Program {
      public static Scanner sc = new Scanner(System.in);
      private static List<Book> bookList = new ArrayList<>();
      
      public static Book[] getInstance( ) {
    	  Book[] arr = new Book[4];
    	  arr[0] = new Book(5, "JK Rowling",100.00,"Harry Potter");
    	  arr[1] = new Book(10,"Grady Boch",200.00,"CPP");
    	  arr[2] = new Book(5, "James",100.00,"ham");
    	  arr[3] = new Book(5, "Atharva",100.00,"Deep States");
    	  return arr;
      }
      
      public static void addBooks(Book[] arr ) {
    	  for(Book b:arr) {
    		  bookList.add(b);
    	  }
      }
      
      public static void acceptBook(String isbn) {
    	  //Book key = new Book();
    	  System.out.println("Enter the isbn");
    	  String str = sc.next();
    	  System.out.println("Enter the quantity");
    	  int quantity = sc.nextInt();
    	  System.out.println("Enter the Author Name");
    	  String name = sc.next();
    	  System.out.println("Enter the Price");
    	  int price = sc.nextInt();
    	  Book[] bookid = new Book[1];
    	  bookid[0] = new Book(quantity,name,price,str);
    	  bookList.add(bookid[0]);
    	  
      }
      
      public static void displayBook( ) {
    	  for(Book b:bookList) {
    		  System.out.println(b.toString());
    	  }
      }
      
      public static void reverseOrder( ) {
    	  Book[] bo = new Book[bookList.size()];
    	  Iterator<Book> itr = bookList.iterator();
    	  int cnt = 0;
    	   while(itr.hasNext()) {
    		   Book b = itr.next();
    		   bo[cnt] = b;
    		   cnt++;
    	   }
    	   for(int i=bookList.size()-1;i>=0;i--) {
    		   System.out.println(bo[i]);
    	   }
      }
      
      public static boolean removeBook(String isbn) {
    	  Book b = new Book();
    	  b.setIsbn(isbn);
    	  int index = bookList.indexOf(b);
    	  if(index!=-1) {
    		  bookList.remove(index);
    		  return true;
    	  }
    	  return false;
      }
      
      public static int menulist() {
    	  System.out.println("0. Exit");
    	  System.out.println("1. Add books to the cart1");
    	  System.out.println("2. Display all books in forward order");
    	  System.out.println("3.  Display all books in reverse order");
    	  System.out.println("4. Delete a book at given index.");
    	  System.out.println("5. Sort all books by price in desc order");
    	  return sc.nextInt();
      }
      
      public static void main(String[] args) {
    	  int choice;
    	  while((choice=menulist())!=0){
    		  switch(choice) {
    		  case 1:
    			  Book[] book = Program.getInstance();
    			  Program.addBooks(book);
    			  break;
    		  case 2:
    			  Program.displayBook();
    			  break;
    		  case 3:
    			  Program.reverseOrder();
    			  break;
    		  case 4:
    			  System.out.println("Enter the isbn");
    			  String str = sc.next();
    			  Program.removeBook(str);
    			  break;
    		  
    		  case 5:
    			  Comparator<Book> comparator = new SortInPrice();
    			  bookList.sort(comparator);
    			  Program.displayBook();
    			  break;
    	      default:
    	    	  System.out.println("Invalid Choice");
    	    	  break;
    	  }
      }
    }
}