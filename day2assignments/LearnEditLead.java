package week2.day2assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class LearnEditLead {
	
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		//load the Url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the window 
		driver.manage().window().maximize();
		//to locate the username field and type the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter the password 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//to click login button 
		driver.findElement(By.className("decorativeSubmit")).click();
		//to verify the title 
		System.out.println(driver.getTitle());
		//to click on crmsfa link 
		driver.findElement(By.partialLinkText("CRM")).click();
		//click on leads link 
		driver.findElement(By.linkText("Leads")).click();
		//click on createLead link
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter the CompanyName Field Using Xpath. 
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		//Enter the FirstName Field Using Xpath. 
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Subraja");
		//Enter the LastName Field Using Xpath. 
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");
		//Enter the FirstName (Local) Field Using Xpath. 
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Subraja");
		//Enter the Department Field Using any Locator of// locator of your choice. 
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
		//Enter the Description Field Using any Locator of your choice. 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Tutor");
		//Enter your email in the E-mail address Field using the locator of your choice. 
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf@gmail.com");
		//Select State/Province as NewYork Using Visible Text. 
		WebElement stDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec = new Select(stDD);
		sec.selectByVisibleText("Texas");
		//Click on the Create Button. 
		driver.findElement(By.name("submitButton")).click();
		//Click on the edit button. 
		driver.findElement(By.className("subMenuButton")).click();
		//Clear the Description Field.
		driver.findElement(By.id("createLeadForm_description")).clear();
		//Fill the Important Note Field with Any text. 
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Learning Session");
		//Click on the update button. 
		driver.findElement(By.name("submitButton")).click();
		//Get the Title of the Resulting Page. 
		System.out.println(driver.getTitle());
		//Close the browser window. 
	    driver.close();

	
}
}
