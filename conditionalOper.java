import java.util.Scanner;

public class conditionalOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Finding greatest of three numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int result = (n1 > n2 && n1 > n3) ? n1 : (n2 > n1 && n2 > n3) ? n2 : n3;
		System.out.println("Biggest number is " + result);
		
		
	}

}
