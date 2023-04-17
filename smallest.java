import java.util.Scanner;
public class smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Scanner sc = new Scanner(System.in);
  int n,i=1,small=0;
	while (i <= 10)
	{
		System.out.println("Enter a Number");
		n = sc.nextInt();
		if(i==1)
		{
			small = n;
		}
		if(n < small)
		{
			small = n;
		}
		i++;
	}
	System.out.println("Smallest number is  = "+small);
  
	}

}
