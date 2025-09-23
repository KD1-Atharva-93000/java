package com.app.fruits;

public class Orange extends Fruit {
     public Orange(String color, double weight, String name) {
    	 super(name,weight,color);
     }
     
     public String taste() {
    	 return "Ssweet and Sour";
     }
}
