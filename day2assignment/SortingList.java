package week3.day2assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingList {
public static void main(String[] args) {

	
	List<String> elements = new ArrayList();
	elements.add("HCL");
	elements.add("Wipro");
	elements.add("Aspire Systems");
	elements.add("CTS");
	
	Collections.sort(elements);
	Collections.reverse(elements);
	
	System.out.println(elements);
	}
		

}
