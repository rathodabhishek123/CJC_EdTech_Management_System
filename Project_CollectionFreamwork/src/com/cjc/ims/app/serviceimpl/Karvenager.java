package com.cjc.ims.app.serviceimpl;

import com.cjc.ims.app.model.*;
import com.cjc.ims.app.servicei.Cjc;
import java.util.*;

public class Karvenager implements Cjc {

	Scanner sc = new Scanner(System.in);

	List<Course> clist = new ArrayList<>();

	List<Faculty> flist = new ArrayList<>();

	List<Batch> blist = new ArrayList<>();

	List<Student> slist = new ArrayList<>();

	//------------------------------------------------------------------------------------------------------------------
	@Override
	public void addCourse() {
		
		try {
		System.out.println("---AddCourse---");
		Course c = new Course();
		
			
		System.out.print("Enter Course Id: ");
		c.setCid(sc.nextInt());
		System.out.print("Enter Course Name: ");
		c.setCname(sc.next());
		
		clist.add(c);
		
		System.out.println("Course added Successfully!!!");
		
		}

		catch(Exception a) {
			System.out.println("Enter Valid Value for this Format....Thank You!");
			sc.nextLine(); 

		}
		
		
	

	}
	
	
	
	//------------------------------------------------------------------------------------------------------------------

	@Override
	public void viewCourse() {
		

		if (clist.isEmpty()) {

			System.out.println("Please Enter Cource Details First");
			addCourse();
		} else {
			
			System.out.println("---ViewCourse---");
			for (Course c2 : clist) {

				System.out.println("-----------------------------");
				System.out.println("Course Id	: " + c2.getCid());
				System.out.println("Course Name	: " + c2.getCname());
				System.out.println("-----------------------------");
				System.out.println();
				
				
			}

		}

	}
	
	//------------------------------------------------------------------------------------------------------------------

	@Override
	public void addFaculty() {
		
		
	try {
		
	if (clist.isEmpty()) {
		System.out.println("Please Enter Cource Details First");
			return;
	}
	else {
		System.out.println("---AddFaculty---");	
		
		Faculty f = new Faculty();
		
		System.out.print("Enter Fid:");
		f.setFid(sc.nextInt());

		System.out.print("Enter Fname:");
		f.setFname(sc.next());
		
		for (Course c : clist) {
			System.out.println("Course Id:"+c.getCid() + "\n" + "Course Name: "+c.getCname());
		}
		
		System.out.print("Enter a Course Id to Assign Faculty: \n");
		int id=sc.nextInt();
		
		for(Course c:clist) {
			
			if(id==c.getCid()) {
				
				f.setCourse(c);
				break;
			}
			
		}
		
	//f.setCourse(clist.get(0));
		
			flist.add(f);
			
			System.out.println("Faculty added Successfully!!");
			System.out.println();
			System.out.println("Faculty Assign Successfully!!");
		   }
		
	}
		
		catch(Exception a) {
			System.out.println("Enter Valid Value for this Format....Thank You!");
			

		}
	}

	
	//------------------------------------------------------------------------------------------------------------------

	@Override
	public void viewFaculty() {

		if (clist.isEmpty()) {
			System.out.println("Please Enter Faculty Details First");
				return;
	
	}	
	else {
		System.out.println("---ViewFaculty---");
		for (Faculty f1 : flist) {
			System.out.println("-----------------------------");
			System.out.println("Faculty Id is	: " + f1.getFid());
			System.out.println("Faculty Name is	: " + f1.getFname());

			//for (Course c2 : clist) {
			Course c=f1.getCourse();
			
			if(c!=null) {

				System.out.println("Course Id is	: " + c.getCid());
				System.out.println("Course Name is	: " + c.getCname());
				System.out.println("-----------------------------");
				System.out.println();
				
				}
			}
	   }
}
	
		
	//------------------------------------------------------------------------------------------------------------------

	@Override
	public void addBatch() {
		
		try {
			
		if (clist.isEmpty()) {

			System.out.println("Please Enter Faculty Details First");
			return;
				
		}
	else {
		
		System.out.println("---AddBatch---");	
		Batch b = new Batch();

		System.out.print("Enter Bid: ");
		b.setBid(sc.nextInt());

		System.out.print("Enter Bname: ");
		b.setBname(sc.next());
		
		for(Faculty f:flist) {
			System.out.println("Faculty Id: "+f.getFid()+"\n"+"Faculty Name: "+f.getFname());
		}
		
		System.out.print("Enter a Faculty Id to Assign Batch: \n");
		int id=sc.nextInt();
		
		for(Faculty f1:flist) {
			
			if(id==f1.getFid()) {
				
				b.setFaculty(f1);
				break;
			}
			
		}
		
		blist.add(b);
		//b.setFaculty(flist.get(0));
		
		System.out.println("Batch added Successfully!!!");
		System.out.println();
		System.out.println("Batch added Successfully!!!");
		}
	}
		
	catch(Exception a) {
			System.out.println("Enter Valid Value for this Format....Thank You!");
		}
	}
	
	
	//------------------------------------------------------------------------------------------------------------------

	@Override
	public void viewBatch() {
	
	if (clist.isEmpty()) {
			System.out.println("Please Enter Batch Details First");
				return;
		}
	else {
	
		System.out.println("---ViewBatch---");

		for (Batch b1 : blist) {

			System.out.println("-----------------------------");
			System.out.println("Batch Id is		: " + b1.getBid());
			System.out.println("Batch Name is	: " + b1.getBname());
			
						Faculty ff=b1.getFaculty();

			if (ff!=null ) {
				
				System.out.println("Faculty Id is	: " + ff.getFid());
				System.out.println("Faculty Name is	: " + ff.getFname());
				
								Course cc=ff.getCourse();

				if(cc!=null) {

					
					System.out.println("Course Id is	: " + cc.getCid());
					System.out.println("Course Name is	: " + cc.getCname());
					System.out.println("-----------------------------");
					System.out.println();
					
					
				}
			}
		}
	}
}
		
	
	//------------------------------------------------------------------------------------------------------------------

	@Override
	public void addStudent() {
		
try {
	
	if (clist.isEmpty()) {

		System.out.println("Please Enter Batch Details First");
		return;
	}
	else {
	
		System.out.println("---AddStudent---");
		
		
		Student s = new Student();

		System.out.print("Enter Sid: ");
		s.setSid(sc.nextInt());

		System.out.print("Enter Sname: ");
		s.setSname(sc.next());
		
		
		for(Batch b:blist) {
			System.out.println("Batch Id: "+b.getBid()+"\n"+"Batch Name: "+b.getBname());
		}
		
		System.out.print("Enter a Batch Id to Assign Student : \n");
		int id=sc.nextInt();
		
		for(Batch b1:blist) {
			
			if(id==b1.getBid()) {
				
				s.setBatch(b1);
			}
		}
		//s.setBatch(blist.get(0));

		slist.add(s);
		
		System.out.println("Students added Successfully!!!");
		System.out.println();
		System.out.println("Students Assign Successfully!!!");
		
		}

	}
	catch(Exception a) {
	System.out.println("Enter Valid Value for this Format....Thank You!");
	
	}
}

	
	//------------------------------------------------------------------------------------------------------------------
	@Override
	public void viewStudent() {

	
	if (clist.isEmpty()) {
			System.out.println("Please Enter Student Details First");
				return;
		}
	else {
		
		System.out.println("---ViewStudent---");
		
		for (Student s1 : slist) {

			System.out.println("-----------------------------");
			System.out.println("Student Id is	: " + s1.getSid());
			System.out.println("Student Name is	: " + s1.getSname());
			
					Batch bb=s1.getBatch();
			
			if (bb!=null) {

				System.out.println("Batch Id is	    : " + bb.getBid());
				System.out.println("Batch Name is   : " + bb.getBname());
				
						Faculty ff=bb.getFaculty();

				if(ff!=null) {
					
					System.out.println("Faculty Id is  : " + ff.getFid());
					System.out.println("Faculty Name is: " + ff.getFname());
				
								Course cc=ff.getCourse();

					if(cc!=null) {

						
						System.out.println("Course Id is  : " + cc.getCid());
						System.out.println("Course Name is: " + cc.getCname());
						System.out.println("-----------------------------");
						System.out.println();
						
						}
					}
				}
			}
		 }
      }
}
