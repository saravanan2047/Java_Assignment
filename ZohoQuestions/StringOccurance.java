package ZohoQuestions;

import java.util.Scanner;

/*7) Find if a String2 is substring of String1. If it is, return the index of the first
occurrence. else return -1.
Eg 1: Input: String 1: test123string
          String 2: 123
         Output: 4
Eg 2:  Input: String 1: testing12
         String 2: 1234
         Output: -1
*/
public class StringOccurance 
{

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the two strings :");
		String a=scan.next();
		String b=scan.next();
		if(a.contains(b))
		{
			System.out.println(a.indexOf(b));
		}
		else
		{
			System.out.println("-1");
		}

	}

}
