package assignment;

public class Studentdata {
	public static void main(String[] args) {
		Student data = new Student(52, "Sahil Thorve", "Computer Engg", 2026, 75);
		data.studentDetails();
		data.studentGrade();
		System.out.println();
		Student data1 = new Student(53, "Kunal Topare", "Computer Engg", 2026, 65);
		data1.studentDetails();
		data1.studentGrade();
		System.out.println();
		Student data2 = new Student(53, "Samarth Mahi", "Computer Engg", 2026, 55);
		data2.studentDetails();
		data2.studentGrade();
	}
}
