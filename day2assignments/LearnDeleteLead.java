package week2.day2assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDeleteLead {
	public static void main(String[] args) {
    EdgeDriver driver = new EdgeDriver();
    driver.get("http://leaftaps.com/opentaps/");
    driver.manage().window().maximize();
    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.partialLinkText("CRM")).click();
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.linkText("Find Leads")).click();
    //Click on the "Phone" tab. 
    //driver.findElement(By.name("Phone")).click();
    driver.findElement(By.xpath("//span[text()='Phone']")).click();
    //driver.findElement(By.id("ext-gen863")).click();
    //Enter the phone number. 
    driver.findElement(By.name("phoneNumber")).sendKeys("9878545781");
    //Click the "Find leads" button. 
    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
    //Capture the lead ID of the first resulting lead. 
    //driver.findElement(By.xpath("//a[text()='10063']")).click();
    
    //Click the first resulting lead. 
    //driver.findElement(By.linkText("10063")).click();
    //driver.findElement(By.id("ext-gen865")).click();
    //driver.findElement(By.xpath("//a[@id='ext-gen870']")).click();
    //driver.findElement(By.xpath("//a[text()='10063']")).click();
    
    //Click the "Delete" button. 
   
    // Click "Find leads" again.  
    
    //Enter the captured lead ID. 
    
    //Click the "Find leads" button. 
    
    //Verify the presence of the message "No records to display" in the Lead List. This 
    //message confirms the successful deletion.
    
    //Close the browser. 
    
    
	}

}
