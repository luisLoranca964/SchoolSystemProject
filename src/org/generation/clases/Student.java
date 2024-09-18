package org.generation.clases;

public class Student {
	 String firstName;
     String lastName;
     int registration;
     int grade;
     int year;

	public Student(String firstName, String lastName, int registration, int grade, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}
	
	public Student(String firstName, String lastName, int registration) {
		this(firstName,lastName,registration,23,2024);
	}

	public Student(String firstName) {
		this(firstName,"last name",23);
	}
	
    public void printFullName(){
        System.out.println(firstName+" "+lastName);
     }

     public void isApproved(){
    	 if(grade>=60) {
    		 System.out.println("Approved");
    	 }else {
    		 System.out.println("Failed");
    	 }
     }

     public int changeYearIfApproved(){
    	 if(grade>=60) {
    		 System.out.println("Congratulations");
             return year=year+1;
    	 }else
    	 return year;
     }
}
