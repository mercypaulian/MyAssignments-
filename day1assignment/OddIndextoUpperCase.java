package week3.day1assignment;

public class OddIndextoUpperCase {
public static void main(String[] args) {
	String test = "changeme";
	
	//length of an array
	int len = test.length();
	System.out.println("Length of array is  "+len);
	
		
	//convert to char array 
	char[] ch = test.toCharArray();
	

	//to get characters in odd positions
	for (int i = 0; i < ch.length; i++) {
	if (i%2!=0) {
	
	System.out.println(test.toUpperCase().charAt(i));
	//System.out.println("Odd characters are "+test.charAt(i));
	//System.out.println(test.toUpperCase().charAt(i));
	//System.out.println(ch[i]);
	}

		

	}
	
	
	
	}
	
}
