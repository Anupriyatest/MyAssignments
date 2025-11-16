package assignment.week2.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		// Split the text into an array of words using space as the delimeter
				String[] words = test.split(" ");
				//  Traverse through each word using loop
		        for (int i = 0; i < words.length; i++) {
		        // Find the odd index 
		            if (i % 2 != 0) { 
		        // Convert the String array element into character array
		                char[] chars = words[i].toCharArray();
		        // Print the odd-position word in reverse using another loop
		                for (int j = chars.length - 1; j >= 0; j--) {
		                    System.out.print(chars[j]);
		                }

		            } else {
		                // Print even-position words as they are
		                System.out.print(words[i]);
		            }

		            // Add a space after each processed word
		            System.out.print(" ");
		        }
		            }
		        	
	}


