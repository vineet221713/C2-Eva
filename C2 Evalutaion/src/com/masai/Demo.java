package com.masai;
public class Demo
{
public static void main(String[] args){

StudentBean student1 = new StudentBean();
student1.setRoll(200);
student1.setName("Rahul");
student1.setMarks(500);

student1.showDetails();


StudentBean student2 = new StudentBean(151, "bishu", 550);
System.out.println("Student1 details: ");
System.out.println("Student2 details using getter methods");
System.out.println("Roll is :"+student2.getRoll());
System.out.println("Name is :"+student2.getName());
System.out.println("Marks is :"+student2.getMarks());
}
}
