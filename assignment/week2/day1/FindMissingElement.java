package assignment.week2.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an array literal way
		int[] input = { 1, 4, 3, 2, 8, 6, 7};
		// Array sorting
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {
			if (input[i] != i + 1) {
				System.out.println("Missing number is :" + (i + 1));
			break;	
			}

		}
	}

}
