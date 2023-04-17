import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("Major");
		}
		else if(age < 0)
		{
			System.out.println("Invalid Age");
		}
		else
		{
			System.out.println("Minor");
		}

	}

}
