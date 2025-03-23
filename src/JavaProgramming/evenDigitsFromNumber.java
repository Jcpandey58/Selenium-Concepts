package JavaProgramming;

//10. WAP TO PRINT ALL EVEN DIGITS FROM A GIVEN NUMBER
import java.util.Scanner;
public class evenDigitsFromNumber
{
	public static void main(String []args)
	{
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int rem=0;
		while(num>0)
		{
			rem=num%10;
//			if (rem%2==0)
//			{
				System.out.println(rem);
//			}
			num=num/10;
		}
	}
}