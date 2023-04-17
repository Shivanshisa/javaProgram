
public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Sum of Even and odd Numbers:");
		int i=1;
		int sum = 0;
		int odd = 0;
		while(i<= 100)
		{
			if(i %2 == 0)
			{
				sum = sum + i;	
			}
			
			else
			{
				odd = odd + i;
			}
			i++;
		}
		System.out.println("Sum of EVEN numbers are :" + sum);
		System.out.println("Sum of ODD numbers are :" + odd);
	}

}
