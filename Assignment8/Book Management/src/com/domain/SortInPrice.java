package com.domain;

import java.util.Comparator;

public class SortInPrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		int diff = (int) -(o1.getPrice() - o2.getPrice());
		return diff;
	}
	
	
   
}
