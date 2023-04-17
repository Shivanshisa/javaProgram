
public class multiplicationTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Displaying tables from 1 to 10");
		mulTable();
	}
	  static void mulTable()
	  {
		
		int i;
		int p=1;
		int j;
		for (i=1;i<=10;i++)
		{
				
			for (j=1;j<=10;j++)
			{
				
			p= j* i;
			System.out.print(+i + "*" + j +"=" + p +"\t");
			
			}
			System.out.println();
			}
	  }

}
