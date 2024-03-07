package assignment1;

public class IsPrime {
	public static void main(String[] args) {
		int num = 5;
		for (int i = 2; i <= num/2; ++i) {
		if (num%i==0) {
			System.out.println("The given number "+num+" is not prime");
		}
		else {
            System.out.println("The given number "+num+" is prime");
		}
		}
	}

}