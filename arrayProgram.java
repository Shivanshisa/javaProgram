import java.util.*;

public class arrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int size = sc.nextInt();
		int ar[] = new int[size];
		System.out.println("Enter your " + size + " values");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Displaying all values");
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(ar[j]);
		}
		Arrays.sort(ar);
     System.out.println("Smallest number is  " + ar[0]);
     System.out.println("Second Smallest number is " + ar[1]);
     System.out.println("Biggest number is  " + ar[size-1]);
     System.out.println("Second Biggest number is  " + ar[size-2]);
     
}
}
