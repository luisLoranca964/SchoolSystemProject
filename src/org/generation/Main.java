package org.generation;

import org.generation.clases.Courses;
import org.generation.clases.Student;

public class Main {

	public static void main(String[] args) {
		Student s=new Student("luis","loranca",00001,80,2024);
		Student s2=new Student("angel","lara",00002,90,2024);
		Student s3=new Student("carmela","martinez",00003,50,2024);
		Courses c=new Courses("Mathematics 1","JC",2024);
		Student[] students = { s, s2, s3 };
		
		
		s.printFullName();
		s.isApproved();
		System.out.println(s.changeYearIfApproved());
		System.out.println("+++++++++++++++++++++++++++++++");
		
		s2.printFullName();
		s2.isApproved();
		System.out.println(s2.changeYearIfApproved());
		System.out.println("+++++++++++++++++++++++++++++++");
		
		s3.printFullName();
		s3.isApproved();
		System.out.println(s3.changeYearIfApproved());
		System.out.println("+++++++++++++++++++++++++++++++");
		
		c.enroll(students);
		System.out.println(c.countStudents());
		System.out.println(c.bestGrade());
		System.out.println("+++++++++++++++++++++++++++++++");
		c.unEnroll(s);
		System.out.println(c.countStudents());
	}

}
