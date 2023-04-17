import java.util.Scanner;
public class Price {

	public static void main(String[] args) {
		//Finding Price of the Item

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Item Number");
		int itn = sc.nextInt();
		System.out.println("Enter the name of the Item");
		String name = sc.next();
		System.out.println("Enter the rate of the item");
		double rate = sc.nextDouble();
		System.out.println("Enter the Quantity");
		int qt = sc.nextInt();
		//Calculating Price of the item:
		double price = rate * qt;
		
		System.out.println("Price of the Item is  " + price);
		
	}

}
