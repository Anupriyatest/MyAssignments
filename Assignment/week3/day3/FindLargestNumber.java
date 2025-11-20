package assignment.week3.day3;

import java.util.ArrayList;
import java.util.Collections;


public class FindLargestNumber {

	public static void main(String[] args) {
		// Declare arrays
					int[] array= { 3, 2, 11, 4, 6, 7 };
					
					// Convert arrays to ArrayLists
					ArrayList<Integer> list = new ArrayList<>();
			        for (int num : array) {
			            list.add(num);
			        }

			        // Arrange in ascending order
			        Collections.sort(list);
					int secondLargest = list.get(list.size() - 2);
					System.out.println("Second largest number is :" +secondLargest);
					
	}

}
