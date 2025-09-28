package com.domain;

import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;


public class Book implements Comparator<Book> {
   
private int quantity;
   private String authorName;
   private double price;
   private String isbn;
   
   
   
   
public Book() {
	//super();
	// TODO Auto-generated constructor stub
}
public Book(int quantity, String authorName, double price, String isbn) {
	super();
	this.quantity = quantity;
	this.authorName = authorName;
	this.price = price;
	this.isbn = isbn;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
@Override
public String toString() {
	return "Book [quantity=" + quantity + ", authorName=" + authorName + ", price=" + price + ", isbn=" + isbn + "]";
}



//@Override
//public int hashCode() {
	//return Objects.hash(authorName, isbn, price, quantity);
//}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	//return Objects.equals(authorName, other.authorName) && Objects.equals(isbn, other.isbn)
		//	&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity;
	
	if(this.isbn ==other.isbn) {
		return true;
	}
	return false;
}
@Override
public int compare(Book x, Book y) {
	int diff = (int) (x.getPrice()-y.getPrice());
	return diff;
}

	   
	   
}
