package week3.day2assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AjioList {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		//driver.findElement(By.className("ic-search")).click();
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		//driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		//driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']")).click();
		//driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		
		
		//to find multiple elements 
		List<WebElement> bags = driver.findElements(By.className("brand"));
		
		//Print the count of the items found. 
		System.out.println(driver.findElement(By.xpath("//div[@class='length']")));
	    //System.out.println(bags.size());
		
		
		
		
		
		//List<String> bags = new ArrayList();
		//bags.add("names");
		
		
		
		// Get the list of brand of the products displayed in the page and print the list. 
		//List<String> brand = new ArrayList();
		//brand.contains("brand");
	    //System.out.println("Brand  : " +bags.listIterator());


		//Get the list of names of the bags and print it 
		
				
			}
	}
	
