package week3.day1;

public class ReverseOddPositionWords {

	public static void main(String[] args) {
		String test = "I am a software tester";

        // Split the string into words
        String[] words = test.split(" ");
     // Traverse through each word
        for (int i = 0; i < words.length; i++) {

            // If index is odd, reverse the word
            if (i % 2 != 0) {

                // Convert word to character array
                char[] chars = words[i].toCharArray();

                // Print reversed word using another loop
                for (int j = chars.length - 1; j >= 0; j--) {
                    System.out.print(chars[j]);
                }
       
          } 
            
            // If index is even, print word as it is
            else {
                System.out.print(words[i]);
            }

            // Concatenate space after each word
            System.out.print(" ");
        }
	}

}
