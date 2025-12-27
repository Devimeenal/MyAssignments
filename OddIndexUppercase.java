package week3.day1;

public class OddIndexUppercase {

	public static void main(String[] args) {

		String test = "changeme";

        // Convert String to character array
        char[] chars = test.toCharArray();

        // Loop from end to start
        for (int i = chars.length - 1; i >= 0; i--) {

            // Check if index is odd
            if (i % 2 != 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

     // Print the expected output
        System.out.println(new String(chars));
        
	}

}
