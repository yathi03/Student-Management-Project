package com.jav.studentmag;
import java.util.*;

public class TestSudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Welcome Student Marks Management System");
		System.out.println("----------------------------------------------------------------------------------");
		
		Student s=new Student(sc);
		
		while(true)
		{
			System.out.println();
			System.out.println("1.Create Student");
			System.out.println("2.View Student");
			System.out.println("3.Update Student");
			System.out.println("4.Delete Student");
			System.out.println("5.Exit");
			
			System.out.println("Enter the value");
			int num=sc.nextInt();
			
			switch(num)
			{
				case 1:new Student(sc);
				break;
				case 2:s.display();
				break;
				case 3:System.out.println("Enter Id to Update");
						int ups=sc.nextInt();
						s.update(ups);
						break;
				case 4:s.delete(sc);
				break;
				case 5:System.exit(0);
				
				default:
					System.out.println("Invaild Entry");
				
			}
			
		}
		

	}

}
