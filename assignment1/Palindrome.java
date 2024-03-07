package assignment1;

public class Palindrome {
	public static void main(String[] args) {
		int input = 84646;
		int output = 0;
		int remainder;
		int temp = input;
		while (input > 0) {
			remainder = input%10;
			output = (output*10) + remainder;
			input = input/10;
			if (temp==output) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not a Palindrome");

			}
				
			}
			
		}
		
		
	}

