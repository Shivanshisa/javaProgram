interface Apples
{
	void displayAppleCost();
}
interface Mangoes
{
	void displayMangoCost();
}
class Fruits implements Apples,Mangoes
{   int app,man;
	Fruits(int app,int man)
	{
	  this.app = app;
	  this.man = man;
	}
	public void displayAppleCost()
	{
		System.out.println("Cost of Apple = " + app + " " + "Rs/kg");
	}
	public void displayMangoCost()
	{
		System.out.println("Cost of Mangoes = " + man + " " + "Rs/kg");
	}
}
public class FruitDemoInterface {

	public static void main(String[] args) {
        Fruits fru = new Fruits(67,89);
        fru.displayAppleCost();
        fru.displayMangoCost();
	}

}
