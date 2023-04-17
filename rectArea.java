
class Rectangle
{
	int length;
	int breadth;
	int ar;
	Rectangle(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	void area()
	{
		ar = length * breadth;
	}
	void dispArea()
	{
		System.out.println("Area of rectangle = " + ar);
	}
}

public class rectArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rec = new Rectangle(20,45);
		rec.area();
		rec.dispArea();
		
	}

}
