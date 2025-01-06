package ExceptionHandling;

public class tryCatch {
	public static void main(String[] args) {
		int num=65;
		try {
			int b=num/0;
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e);
			e.getMessage();
		}
		
		System.out.println("Completed");
	}
}
