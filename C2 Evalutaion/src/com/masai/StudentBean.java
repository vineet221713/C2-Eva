package com.masai;


public class StudentBean {
	private int roll;
	private String name;
//	private String address;
	private int marks;

	public StudentBean() {
	
	}
	public StudentBean(int roll,String name,int marks){
		this.roll=roll;
		this.name=name;
//		this.address;
		this.marks=marks;
		}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void showDetails(){
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
		}
	public void average() {
		
	}

}
