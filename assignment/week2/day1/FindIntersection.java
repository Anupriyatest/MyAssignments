package assignment.week2.day1;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array creation
		int a[] = { 3, 2, 11, 4, 6, 7 };
		int b[] = { 1, 2, 8, 4, 9, 7 };
		// nested loop to find matching element
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				// Compare both the arrays using a conditional statement.
				if (a[i] == b[j]) {
					// Print the value from first array when there is a match
					System.out.println("Matching element found: " + a[i]);

				}
			}
		}
	}
}
