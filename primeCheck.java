import java.util.Scanner;

public class primeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if it is Prime or not");
		int n = sc.nextInt();
		
		if(primeNum(n))
		{
			System.out.println(n + "is a Prime number");
			
		}
		else
		{
			System.out.println(n + "is not a Prime number");	
		}
		
	}
	static boolean primeNum(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<=num/2;i++)
		{
			if((num%i)==0)
				return false;
		}
			return true;
		
	}

}
