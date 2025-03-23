package JavaProgramming.String;

public class VowelsAndConsonents {
	public static void main(String[] args) {
		String a="abcde";
		String b="";
		int acount=0;
		int bcount=0;
		//To count Vowels and Consonants
		for (int i=0; i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e' ) {
				acount++;
			}
			else {
				bcount++;
			}
		}
		System.out.println(acount);
		System.out.println(bcount);

		// to remove Vowels OR Consonants
		for (int i=0; i<a.length();i++) {
			if(a.charAt(i)!='a'&& a.charAt(i)!='e' ) {
				b=b+a.charAt(i);
			}
		}
		System.out.println(b);
	}
}