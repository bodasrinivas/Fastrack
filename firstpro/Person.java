package com.java.firstpro;

public class Person {

	
	private int height;
	private int weight;
	private String name;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void main(String []args) {
		Person p1 = new Person();
		/*p1.setHeight(150);
		p1.setName("Keith");
		p1.setWeight(168);*/
		p1.height = 160;
		p1.weight = 172;
		p1.name = "Ann";
		System.out.println(p1.height);
		System.out.println(p1.weight);
		System.out.println(p1.name);
	}
	
	
}
