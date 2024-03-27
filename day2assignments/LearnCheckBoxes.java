package week2.day2assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnCheckBoxes {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		//add implicit time 
		
		// Click on the "Basic Checkbox.”
        driver.findElement(By.xpath("//span[text()='Basic']")).click();
        
        //Click on the "Notification Checkbox." 
        driver.findElement(By.xpath("//span[text()='Ajax']")).click();
        
		//Verify that the expected message is displayed
       
        
        //Click on your favorite language
        driver.findElement(By.xpath("//label[text()='Java']")).click();
        
        //Click on the "Tri-State Checkbox." 
        driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
        
		//Verify which tri-state option has been chosen. 
        
        //Click on the "Toggle Switch." 
        driver.findElement(By.className("ui-toggleswitch-slider")).click();
        
        //Verify that the expected message is displayed. 
        
        //Verify if the Checkbox is disabled. 
        driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
       
        
        //Select multiple options on the page (details may be needed). 
        //driver.findElement(By.className("ui-selectcheckboxmenu-multiple ui-selectcheckboxmenu ui-widget ui-state-default ui-corner-all")).click();
        //WebElement citiesDD= driver.findElement(By.className("ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all"));
		//Select sec = new Select(citiesDD);
		//sec.selectByIndex(2);
        driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		
        //Perform any additional actions or verifications required. 
        
        //Close the web browser when done.
		driver.close();
	}

}
