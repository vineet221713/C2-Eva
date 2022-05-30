package com.masai;

public class Person {
	String name;
	String Gender;
	
	void address() {
		String city;
		String state;
		String pinCoad;
	}
  
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	

}

class Instructor extends Person{
	int instructorId;
	int salary;
	  
}

class Student extends Person{
	int studentId;
	String courseEnrolled;
	int courseFee;
}

class Main{
public static void main(String args[]){
	Person newStudent = generatePerson(new Student());
	Person newTeacher = generatePerson(new Teacher());
	System.out.println(newStudent);
	System.out.println(newTeacher)
}
}
