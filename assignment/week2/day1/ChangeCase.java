package assignment.week2.day1;

public class ChangeCase {

	public static void main(String[] args) {
		String test = "changeme";
		// convert string to char array
		char[] charArray = test.toCharArray();
		// to iterate thru each charater of the string from end to start
		for (int i = charArray.length - 1; i >= 0; i--) {
			// to find add index
			if (i % 2 != 0) {
				// to covert add index value to Uppercase
				charArray[i] = Character.toUpperCase(charArray[i]);

			}
		}
		// Print the characters
        // Convert the character array back to a String for printing
        String result = new String(charArray);
        System.out.println(result);
	}

}
