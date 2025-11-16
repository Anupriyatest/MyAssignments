package assignment.week2.day1;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		int count = 0;
		// Split the text into an array of words using space as the delimeter
		String[] words = text.split(" ");
		// Create two nested for loops to compare each word with every other word
		for (int i = 0; i < words.length; i++) {

			for (int j = i + 1; j < words.length; j++) {
				// for case insensitive comparison
				if (words[i].equalsIgnoreCase(words[j])) {
			// If a duplicate word is found, replace it with an empty string
					words[j] = " ";  // Replace duplicate with empty string
					count++;         //increment duplicate count

				}

			}
		}
		
		// Print modified array ONLY if count > 1
        if (count > 1) {

            // Second loop to print each non-empty word
            for (String word : words) {
                if (!word.isEmpty()) {     // Avoid printing removed duplicates
                    System.out.print(word + " ");
                }
            }

        } else {
            System.out.println("No duplicate words found.");
	}
	}
}


