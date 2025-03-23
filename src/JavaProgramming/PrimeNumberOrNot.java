package JavaProgramming;

//7. WAP TO CHECK GIVEN NUMBER IS PRIME NUMBER OR NOT
import java.util.Scanner;
public class PrimeNumberOrNot{
	public static void main(String []args){
		Scanner scn=new Scanner(System.in);
		int num = scn.nextInt();
		int count=0;
	
		for (int i=1;i<=num;i++){
			if(num%i==0){
				count++;	
			}
		}
		if (count==2){
			System.out.println(num+" is a prime number");
		}
		else{
			System.out.println(num+" is a non-prime number");
		}
	}
}
