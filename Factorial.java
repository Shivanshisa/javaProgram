
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----------------------");
		System.out.println("Number" + "\t" + "Factorial");
		System.out.println("---------------------");
		tab();
		
		
	}
		static void tab()
		{
		int i, j;
		int f=1;
		int sum = 0;
		for(i=1;i<=5;i++)
		{
			f= f *i;
				sum = sum + f;
				System.out.println(i + "\t" + f);
		}
		System.out.println("---------------------");
		System.out.println("  sum =  "+ sum);
		System.out.println("---------------------");
	}

}
