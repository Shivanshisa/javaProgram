class Student
{
	int rollNum;
	String studName;
	int mark1;
	int mark2;
	int mark3;
	int totalMarks;
	
	void setStudDetails()
	{
		rollNum = 15;
		studName = "Priya";
		mark1 = 45;
		mark2 = 76;
		mark3 = 82;
	}
	void calculateTotal()
	{
		totalMarks = mark1+mark2+mark3;
	}
	void displayStudDetails()
	{
		System.out.println("Roll no is " + rollNum);
		System.out.println("Student name is " + studName);
		System.out.println("Total marks are " + totalMarks);
	}
}
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std = new Student();
		std.setStudDetails();
		std.calculateTotal();
		std.displayStudDetails();
	}

}
