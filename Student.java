package assignment;

public class Student {
	
	int studentId;
	String studentName;
	String course;
	int year;
	float percentage;
	
	public Student(int studentId,String studentName,String course,int year,float percentage) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.year = year;
		this.percentage = percentage;
	}
	
	public void studentDetails() {
		System.out.println("---------- Student Information ----------");
		System.out.println("Student Id: "+this.studentId);
		System.out.println("Student Name: "+this.studentName);
		System.out.println("Course Name: "+this.course);
		System.out.println("Year of passout: "+this.year);
		System.out.println("Percentage: "+this.percentage);
	}
	
	public void studentGrade() {
		if (this.percentage >= 75 && this.percentage <= 100) {
		    System.out.println("Grade : Distinct");
		} else if (this.percentage >= 65 && this.percentage <= 74) {
		    System.out.println("Grade : First Class");
		} else if (this.percentage >= 55 && this.percentage <= 64) {
		    System.out.println("Grade : Second Class");
		} else if (this.percentage >= 35 && this.percentage <= 54) {
		    System.out.println("Grade : Third Class");
		} else {
		    System.out.println("Grade : Fail");
		}

	}
	
	
}
