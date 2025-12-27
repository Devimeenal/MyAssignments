package week3.day1;

public class RemoveDuplicateWords {

	 public static void main(String[] args) {

	        String text = "We learn Java basics as part of java sessions in java week1";
	        // Initialize count variable
	        int count = 0;

	        // Split the string into words
	        String[] words = text.split(" ");

	        // Compare each word with every other word
	        for (int i = 0; i < words.length; i++) {

	            for (int j = i + 1; j < words.length; j++) {

	                // Case-insensitive comparison
	                if (words[i].equalsIgnoreCase(words[j])) {
	                    words[j] = "";   // Replace duplicate with empty string
	                    count++;
	                }
	            }
	        }

	        // If duplicates are found, print modified array
	        if (count >= 1) {
	            for (int i = 0; i < words.length; i++) {
	                if (!words[i].equals("")) {
	                    System.out.print(words[i] + " ");
	                }
	            }
	        }     
	        
	
}
}