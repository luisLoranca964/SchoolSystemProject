package org.generation.clases;

import java.util.ArrayList;
import java.util.List;

public class Courses {
	String courseName;
	String professorName;
	int year;
	List<Student> enrolled = new ArrayList<Student>();

	public Courses(String courseName, String professorName, int year) {
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
	}

	public void enroll(Student student) {
		if(student!=null) {
			enrolled.add(student);
		}else {
			System.out.println("Student no found");
		}
	}

	public void unEnroll(Student student) {
		if (student!=null) {
			enrolled.remove(student);
		}else {
			System.out.println("Student no found");
		}
	}
	
	public void enroll(Student[] student) {
		if (student!=null) {
			for (Student student2 : student) {
				enrolled.add(student2);
			}
		}else {
			System.out.println("Student no found");
		}
	}

	public int countStudents() {
		return enrolled.size();
	}

	public int bestGrade() {
		int grade=0;
		for (Student student : enrolled) {
			if(grade<student.grade) {
				grade=student.grade;
			}
		}
		return grade;
	}

}
