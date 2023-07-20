package com.rays.comparator;

import java.util.Comparator;

public class Student {
 
  int id = 0;	
  int rollno = 0;	
  String name = null;
  String address = null;
  String course = null;
  String subject = null;
  
  public Student(int id, int rollno, String name, String address, String course, String subject) {
	  this.id = id;
	  this.rollno = rollno;
	  this.name = name;
      this.address = address;
      this.course = course;
      this.subject = subject;
      
 }@Override
	public String toString() {
		
		return this.id + "  " + this.rollno + "  " + this.name + "  " + this.address + "  " + this.course + "  " + this.subject;
	}   
  
}


class SortById implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.id - o2.id;
		
	}
}
 class SortByRoll implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.rollno - o2.rollno;
		
	}
 }
 
 class SortByName implements Comparator<Student> {

  public int compare(Student o1, Student o2) {
	return o1.name.compareTo(o2.name);                                                                                 
     
  
  }

}

 class SortByAddress implements Comparator<Student> {

	  public int compare(Student o1, Student o2) {
		return o1.address.compareTo(o2.address);
	    
	  }
 }
 class SortBycourse implements Comparator<Student> {

	  public int compare(Student o1, Student o2) {
		return o1.course.compareTo(o2.course);
 
	  }
}
 class SortBySubject implements Comparator<Student> {

	  public int compare(Student o1, Student o2) {
		return o1.subject.compareTo(o2.subject);

	  }

	  
}

 
 
 
 