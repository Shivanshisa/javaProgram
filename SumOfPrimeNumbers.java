import java.util.Scanner;
public class SumOfPrimeNumbers  
{
	public static void main(String args[])   
  {  
    int sum = 0, num = 1;  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the last number for the prime sum");
    int n = sc.nextInt();
    while(num <= n)  
    {  
      int i = 2, counter = 0;  
      while(i <= num-1)  
      {  
        if(num % i == 0)  
        {  
          counter++;  
          break;  
        }  
        
        i++;  
        
      } 
       
      if(counter == 0 && num != 1 )            
      {  
        sum = sum + num;  
      }
      num++;  
    }  
    
    System.out.println("The Sum of Prime Numbers  : " + sum);  
    
  } 
}  