
abstract class Fruit
{
	abstract void cost();
}
class Apple extends Fruit
{   int cs;
    Apple(int cs)
    {
    	this.cs = cs;
    }
	void cost()
	{
		System.out.println("Cost of Apple = " + cs +" "+ "Rs/kg");
	}
    	
}
class Mango extends Fruit
{  int csM;
    Mango(int csM)
    {
    	this.csM = csM;
    }
	void cost()
	{
	 System.out.println("Cost of Mango = " + csM + " " +"Rs/kg");
	}
}
public class FruitDemo {

	public static void main(String[] args) {
		Fruit f = new Apple(65);
		f.cost();
		Fruit f1 = new Mango(78);
		f1.cost();
       
	}

}
