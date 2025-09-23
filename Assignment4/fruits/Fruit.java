package com.app.fruits;
import java.util.Scanner;

public abstract class Fruit{
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruit(String color, double weight,String name) {
		this.name = name;
		this.color = color;
		this.weight = weight;
	    this.isFresh = true;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isFresh() {
		return isFresh;
	}
	
	public void setFresh(boolean fresh) {
		this.isFresh = true;
	}
	
	public abstract String taste();
    
	public String toString( ) {
		return " Fruit"+"name: "+name+", color: "+color+", Weight: "+weight+",isfResh: "+isFresh+ "}";
	}
	
}


