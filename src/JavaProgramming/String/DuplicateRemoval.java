package JavaProgramming.String;

public class DuplicateRemoval {
	public static void main(String[] args) {
		String a="Rajeessh";
		String b = ""; 
		char [] ch=a.toCharArray();
//		System.out.println(b.indexOf(a));
        for (char c : ch) {
            if (b.indexOf(c) == -1) { // Check if the character is not already in the result
                b =b+c; // Append the character
			}
            else {
				System.out.println(c);
			}
        }
        System.out.println(b);
	}
}