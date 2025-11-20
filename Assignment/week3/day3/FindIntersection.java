package assignment.week3.day3;

import java.util.ArrayList;

public class FindIntersection {

	public static void main(String[] args) {
		
			// Declare arrays
			int[] arr1 = { 3, 2, 11, 4, 6, 7 };
			int[] arr2 = { 1, 2, 8, 4, 9, 7 };

			// Convert arrays to ArrayLists
			ArrayList<Integer> list1 = new ArrayList<>();
			ArrayList<Integer> list2 = new ArrayList<>();

			for (int num : arr1) {
				list1.add(num);
			}
			for (int num : arr2) {
				list2.add(num);
			}

			// Find intersection
			System.out.print("Intersection: ");
			for (int num : list1) {
				if (list2.contains(num)) {
					System.out.print(num + " ");
				}
			}
		}

	}

