//Student Program using Constructor

class Student1
{
	int rollNo;
	String studName;
	int marks1;
	int marks2;
	int marks3;
	int totalMarks;
	
	Student1(int rollNo,String studName,int marks1,int marks2,int marks3 )
	{
		this.rollNo = rollNo;
		this.studName = studName;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	void calculateTotal1()
	{
		totalMarks = marks1 + marks2 + marks3;
	}
	void displayStudDetails1()
	{
		System.out.println("Student Roll No  is " + rollNo);
		System.out.println("Student Name is " + studName);
		System.out.println("Total Marks = " + totalMarks );
	}
}
public class StudentDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 st = new Student1(32,"Priya",56,82,65);
		st.calculateTotal1();
		st.displayStudDetails1();
	}

}
