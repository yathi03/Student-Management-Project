package com.jav.studentmag;

import java.util.*;

 class Student {
	
	Student stud;
	String name;
	int id;
	String grade;
	static ArrayList<Student> students= new ArrayList<>();
	
	float marks1;
	float marks2;
	float marks3;
	
	
	Scanner sc=new Scanner(System.in);
	
	public Student(Scanner s) {
		System.out.println("Student Info");
		System.out.println("Enter the Student id ");
		this.id=s.nextInt();
		System.out.println("Enter the Student name ");
		this.name=s.next();
		System.out.println("Enter the  Science Marks");
		marks1=s.nextFloat();
		System.out.println("Enter the Math Marks");
		marks2=s.nextFloat();
		System.out.println("Enter the  Computer Marks");
		marks3=s.nextFloat();
		
		students.add(this);
			
	}
	
	
	public void displayStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Science Marks: " + marks1);
        System.out.println("Math Marks: " + marks2);
        System.out.println("Computer Marks: " + marks3);
        System.out.println("----------------------------");
        
        float sum=this.marks1+this.marks2+this.marks3;
		
		float res = (sum/3);
		
		System.out.println("your percentage is "+res+"%");
    }
	
	
	void display()
	{
		System.out.println();
		if(students.isEmpty())
		{
			System.out.println("No Student Found! ");
		}
		
		
	    System.out.println("List of Students:");
        for (Student student : students) {
            student.displayStudentInfo(); 
           
        }	
        
        
        
        
        
		
	}
	
	void delete(Scanner sc)
	{
		System.out.println();
		System.out.println("enter the Student ID to delete");
		int del=sc.nextInt();
		
		
		
		for(Student i:students)
		{
			if(i.id==del)
			{
				students.remove(i);
				System.out.println("Student with ID " + del + " deleted successfully.");
	            break;
			}
			
			else
			{
				System.out.println("Student Not found");
	           
			}
		}
		
	}
	
	void update(int id)
	{
		
		boolean found=false;
		
		for (Student student : students) {
            if(student.id==id) 
            {
            	found=true;
        		
            	System.out.println("science or math or computer");
        		String mak=sc.next();
        		
        		if(mak.equals("science"))
        		{
        			System.out.println("Enter the marks");
        			int m1=sc.nextInt();
        			
        			student.marks1=m1;
        			
        			System.out.println("Science updated!");
        		}
        		
        		else if(mak.equals("math"))
        		{
        			System.out.println("Enter the marks");
        			int m2=sc.nextInt();
        			student.marks2=m2;
        			System.out.println("Math marks updated!");
        		}
        		
        		else if(mak.equals("computer"))
        		{
        			System.out.println("Enter the marks3");
        			int m3=sc.nextInt();
        			student.marks3=m3;
        			System.out.println("computer marks updated!");
        		}
        		break;
            }
        		
        		
            }
            
            
            if(!found)
            {
            	System.out.println("ID not Found !!");
            }
            
            
           
        }
		
		
		
		
		
	
	 
	
	
	public String toString()
	{
		return this.id+" "+this.name;
	}
	
	
	
	
	
}





