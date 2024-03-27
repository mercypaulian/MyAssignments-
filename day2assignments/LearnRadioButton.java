package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnRadioButton {
public static void main(String[] args) {
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.leafground.com/radio.xhtml");
	//Add the ImplicityWait  
	driver.manage().window().maximize();
	//Select 'Your most favourite browser' from the radio buttons 
	driver.findElement(By.xpath("//label[text()='Edge']")).click();
	//Click on a radio button, then click on the same radio button again to verify that 
	//it becomes ‘unselected’.
	driver.findElement(By.xpath("//label[text()='Chennai']")).click();
	
	//Identify the radio button that is initially selected by default. 
	driver.findElement(By.xpath("//label[text()='Safari']")).isSelected();
	//Check and select the age group (21-40 Years) if not already selected. 
    driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();

	
}
}
