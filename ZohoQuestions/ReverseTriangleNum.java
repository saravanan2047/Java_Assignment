package ZohoQuestions;
//Q) 23
import java.util.Scanner;

public class ReverseTriangleNum 
{

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the rows : ");
		int x=scan.nextInt();
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<x-i;k++)
			{
				System.out.print(x-i+" ");
			}
			System.out.println();
		}
	}

}
