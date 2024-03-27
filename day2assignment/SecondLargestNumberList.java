package week3.day2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumberList {
public static void main(String[] args) {
		
		// Declare List
		List<Integer> a = new ArrayList();
		
		//add items in the list 
		a.add(3);
		a.add(2);
		a.add(11);
		a.add(4);
		a.add(6);
		a.add(7);
		 
		//sort
		Collections.sort(a);
		
		//to print the list
		System.out.println(a);
		
		//get second largest number
		System.out.println(a.get(4));
		
	}
	

}
