package JavaProgramming;

import java.util.Arrays;

//To check if the char is present inside the string
public class toCharArray {
	public static void main(String[] args) {
		String s="Selenium";
		int count=0;
		char [] res=s.toCharArray();
		for(int i=0;i<res.length;i++) {
			if(res[i]=='e') {
				count++;
			}
		}
		if (count>0) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		
		//to check how many times it is present
		System.out.println(count);
		System.out.println(Arrays.toString(res));
		
		//to reverse the string
		
	}
}
