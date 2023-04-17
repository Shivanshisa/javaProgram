import java.util.Scanner;

public class constVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char ch = sc.next().charAt(0);
		if(Character.isAlphabetic(ch))
		{
		switch(ch)
		{
		case 'a','A','e','E','i','I','o','O','u','U':
		System.out.println("Character is Vowel");
		break;
		
		default :
			System.out.println("Character is Consonant");
		}		

	}
		else
		{
			System.out.println("Not a character");
		}
	}

}
