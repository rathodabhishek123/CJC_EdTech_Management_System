package com.cjc.ims.app.client;

import java.util.Scanner;

import com.cjc.ims.app.servicei.Cjc;
import com.cjc.ims.app.serviceimpl.Karvenager;


public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Cjc kn=new Karvenager();
		
		try {
		while(true) {
			
	
		System.out.println();
		System.out.println("=======CJC EdTech======");
		
		System.out.println("1.AddCourse\n"+"2.ViewCourse\n"+"3.AddFaculty\n"+"4.ViewFaculty\n"+"5.AddBatch"
				+ " \n"+"6.ViewBatch\n"+"7.AddStudent\n"+"8.ViewStudent\n"+"9.Exit\n");
		
		System.out.print("Enter ur Choice: ");
		int n=sc.nextInt();
		System.out.println();
		
		switch(n) {
		
		case 1: 
			kn.addCourse();
			break;
			
		case 2: 
			kn.viewCourse();
			
			break;
		
		case 3: 
			kn.addFaculty();
			break;
			
		case 4: 
			kn.viewFaculty();
			break;
			
		case 5: 
			kn.addBatch();
			break;
		
		case 6: 
			kn.viewBatch();
			break;
			
		case 7: 
			kn.addStudent();
			break;
			
		case 8: 
			kn.viewStudent();
			break;
		case 9:
			System.exit(0);
			System.out.println("THANK YOU !!");
			
		
		}
	}
		
		
		}
		
catch(Exception b) {
			
			System.out.println("Enter only Number Format..");
		}
		
	}
	
}
