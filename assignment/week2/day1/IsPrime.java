package assignment.week2.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		boolean isPrime = true;

		if (n < 2) {
			isPrime = false;
		} else {
			for (int i = 2; i < n; i++) {

				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {

			System.out.println(n + " - Given Number is Prime");
		} else {
			System.out.println(n + " - Given Number is not  Prime");
		}
	}
}
