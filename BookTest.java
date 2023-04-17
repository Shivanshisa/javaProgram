class Book
{  int bno;
  String bname;
  double price;
	Book(int bno,String bname,double price)
	{
		this.bno = bno;
		this.bname = bname;
		this.price = price;
	}
	Book(){}
		
		void display()
		{
			System.out.println("Book number ="+ bno);
			System.out.println("Book name ="+ bname);
			System.out.println("Price ="+ price);
		}

}
class SpecialEditionBook extends Book
{    int discount;
	SpecialEditionBook(int discount)
	{   
		this.discount = discount;
	}
	SpecialEditionBook(int bno,String bname,double price,int discount)
	{
		super(bno,bname,price);
		this.discount = discount;
	}
	void display()
	{   super.display();
		System.out.println("Discount ="+ discount);
	}
}

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecialEditionBook spc = new SpecialEditionBook(35,"Java",800.45,14);
		spc.display();

	}

}
