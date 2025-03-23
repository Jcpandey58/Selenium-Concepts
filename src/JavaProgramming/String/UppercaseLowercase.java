package JavaProgramming.String;

public class UppercaseLowercase {
	public static void main(String[] args) {
		String a= "HellO";
		String b="";
		String b1="";
		
		int up=0,low=0,count=0;

		//Remove uppercase from string and count 
		for (int i=0; i < a.length();i++) {
			if (a.charAt(i)>='a' && a.charAt(i)<='z') {
				b=b+a.charAt(i);
				//				count++;
			}
			else {
				count++;
			}
		}
		System.out.println(b);
		System.out.println(count);


		//To change upper to lower
		for(int i=0;i<a.length();i++) {
			if (a.charAt(i)>='A' && a.charAt(i)<='Z' ) {
				b1=b1+(char)(a.charAt(i)+32); // Convert to lowercase
			}
			else {
				b1=b1+a.charAt(i);  // Otherwise, keep the character as is
			}
		}

		System.out.println(b1);
	}
}








