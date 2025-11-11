package assignment.week2.day1;

public class Fibonacci {

	public static void main(String[] args) {
		
		int range = 8;
		int num1 =0;
		int num2 =1;
		System.out.println("Fibonacci Series of number range 8  ");
		for (int i = 1; i<=range; i++) {
			
			System.out.println(num1);
			int nextNum = num1 + num2;
			num1=num2;
			num2=nextNum;
		}
			
		

	}

}
