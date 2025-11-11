package assignment.week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 534;
		int output = 0;
		
		for (int i = input; i>0; i=i / 10) {
			
           int R = i % 10;
		   output = output * 10 +R;
					
				}
			
		if (input == output) {

			System.out.println(input+ " - Given Number a Palindrome Number");
		} else {
			System.out.println(input + " - Given Number is not a Palindrome Number");
		}
	}



	}


