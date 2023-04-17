import java.util.Scanner;

public class ItemProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item Number");
		int it = sc.nextInt();
		
		System.out.println("Enter Item Name");
		String name = sc.next();
		
		System.out.println("Enter Rate of the Item");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the Quantity");
		int qty = sc.nextInt();
		
		//calculating the Price:
		double price = rate * qty;
		
		//Calculating discounted price:
		double discount;
		double net = 0;
		if (price >=1000 && price <2000)
		{
		 discount = 0.10 * price;
		 net = price - discount;
		}
		else if(price >= 2000 && price < 3000)
		{
			discount = 0.15 * price;
			net = price - discount;
		}
		else if(price >= 3000 && price < 5000)
		{
			discount = 0.20 * price;
			net = price - discount;
		}
		else if (price >= 5000)
		{
			discount = 0.25 * price;
			net = price - discount;
		}
		else 
		{
		 discount = 0;
		 net = price - discount;
		}
		System.out.println("Item number is :" + it);
		System.out.println("Item name is  :" + name);
		System.out.println("Total Price is :" + price);
		System.out.println("Discount is " +discount);
		System.out.println("Net Price is " + net);

	}

}