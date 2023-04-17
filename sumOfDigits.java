import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sn,digit,sum=0;
		System.out.println("displaying sum of digits");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter digit ");
      sn = sc.nextInt();      
      while(sn>0)
      {
    	digit=sn%10;
    	sum=sum+digit;
    	sn=sn/10;
      }
      System.out.println("Sum "+ sum);
      }
	}
