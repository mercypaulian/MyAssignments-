package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnLeafGroundButtonInteraction {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		//Click on the button with the text ‘Click and Confirm title.’
		//driver.findElement(By.id("j_idt88:j_idt90")).click();
		//Verify that the title of the page is ‘dashboard.’ 
		System.out.println(driver.getTitle());
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.  
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		//Find and print the position of the button with the text ‘Submit.’ 
		System.out.println(driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")));
		//Find and print the background color of the button with the text ‘Find the Save button color.’ 
		System.out.println(driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")));
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’ 
		//System.out.println(driver.findElement(By.id("j_idt88:j_idt98")));
		System.out.println(driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")));
		//Close the browser window. 
		//driver.close();
	}

}
