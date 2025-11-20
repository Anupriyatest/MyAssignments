package assignment.week3.day3;

import java.util.ArrayList;
import java.util.Collections;

public class FindMissingElement {

	public static void main(String[] args) {
		// Declare array
		int[] array = { 1, 2, 3, 4, 10, 6, 8 };

		// Convert arrays to ArrayLists
		ArrayList<Integer> list = new ArrayList<>();
		for (int num : array) {
			list.add(num);
		}

		// Arrange in ascending order
		Collections.sort(list);
		System.out.println("Sorted list:" +list);
		System.out.println("Missing Numbers:");
		for (int i = 0; i < list.size() - 1; i++) {
			int current = list.get(i);
			int next = list.get(i + 1);
			
			// check if next has gap
			if (current + 1 != next) {
				for (int missing = current + 1; missing < next; missing++) {
					System.out.println(missing);
				}
			}
		}
	}
}
