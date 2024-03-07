package assignment1;

public class FibbonacciSeries {
	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		int range = 8;
				System.out.println("First Number: "+firstNum+"\n"+"Second Number: "+secNum);
				for (int i = 0; i < range; i++) {
					sum = firstNum + secNum;
					System.out.println("Fibbonacci Series: "+sum);
					firstNum = secNum;
					secNum = sum;
					
				}
	}

}
