package JavaProgramming;

public class ReverseStrWithoutSplit {
    public static void main(String[] args) {
        String a = "My favourite subject is selenium";
        String word = "";
        String result = "";

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == ' ') {
                result = word + " " + result;
                word = ""; // Reset the word for the next iteration
            } else {
                word = word+ ch; // Build the word character by character
            }
        }
        result = word + " " + result; // Add the last word
        System.out.println(result); 																							// Trim to remove any trailing space
    }
}
