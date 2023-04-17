//Counting number of instances:

class inst
{
	static int counts;
	
	void insta()
	{
		counts++;
	}
}
public class numOfInstances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       inst i1 = new inst();
       i1.insta();
       
       inst i2 = new inst();
       i2.insta();
       inst i3 = new inst();
       i3.insta();
       System.out.println("Total number of instances are :" + inst.counts);
	}

}
