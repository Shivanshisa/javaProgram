
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
	
		//Find Area OF Circle:
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Radius");
		double ra = sc.nextDouble();
		double pi = 3.14;
		double area = pi * ra * ra;
		System.out.println("Area of Circle is : " + area);
	}

}
