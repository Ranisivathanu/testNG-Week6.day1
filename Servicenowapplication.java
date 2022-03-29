package week6day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Servicenowapplication {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev84689.service-now.com");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("admin");
       driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("vZ5P0F^mzX!e");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       WebElement Filter = driver.findElement(By.xpath("//input[@id='filter']"));
       Filter.sendKeys("incidents",Keys.ENTER);
       driver.findElement(By.xpath("(//div[text()='Incidents'])[1]")).click();
       
       driver.switchTo().frame(0);
 	   driver.findElement(By.xpath("//button[text()='New']")).click();
   	   driver.switchTo().parentFrame();
   	   driver.switchTo().frame(0);
   	   WebElement number = driver.findElement(By.xpath("//input[@name='incident.number']"));
   	   String Incidentno = number.getAttribute("value");
   	   System.out.println("ID number:" +Incidentno); 
	   driver.switchTo().parentFrame();
	   driver.switchTo().frame(0);
	   driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("Learn Java");
	   driver.switchTo().parentFrame();
	   driver.switchTo().frame(0);
	   driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
	   driver.switchTo().parentFrame();
	   driver.switchTo().frame(0);
	   WebElement search = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
	   search.sendKeys(Incidentno,Keys.ENTER);
	   driver.switchTo().parentFrame();
	 //update the existing incident  
	   driver.switchTo().frame(0);
	 	driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	   	driver.switchTo().parentFrame();
	   	driver.switchTo().frame(0);
	 	WebElement priority = driver.findElement(By.xpath("(//select[@role='listbox']/option)[1]"));
	 	priority.click();
	 	System.out.println("priotity status:" +priority.getText());
	 	driver.switchTo().parentFrame();
	   	driver.switchTo().frame(0);
	 	WebElement status =driver.findElement(By.xpath("(//select[@role='listbox']/option)[5]"));
	 	status.click();
	 	System.out.println("state:"+status.getText());
		driver.switchTo().parentFrame();
	 	driver.switchTo().frame(0);
	 	driver.findElement(By.xpath("//button[@id='sysverb_update_bottom']")).click();
	   	driver.switchTo().parentFrame();
	   
	   	//Assign the incident
	   	 driver.switchTo().frame(0);
	 	 WebElement assign = driver.findElement(By.xpath("//a[@class='linked formlink']"));
	   	 Actions build = new Actions(driver);
		 build.moveToElement(assign).contextClick().perform();
		 build.click();
		 driver.switchTo().parentFrame();
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//div[text()='Assign Tag']")).click();
		 driver.switchTo().parentFrame();
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//div[text()='New Tag...']")).click();
		 driver.switchTo().parentFrame();
		 Set<String> windowHandles = driver.getWindowHandles();
	     System.out.println(windowHandles);
	     List<String> list=new ArrayList<String>(windowHandles);
	     driver.switchTo().window(list.get(0));
	     driver.switchTo().frame(0);
	     driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("software group");
	     driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//button[@id='save_button']")).click();
		 driver.switchTo().defaultContent();
		
		
		 
		 //delete the incident
  	    driver.switchTo().frame(0);
	 	driver.findElement(By.xpath("//select[@class='list_action_option form-control ']/option[3]")).click();
	   	driver.switchTo().parentFrame();
	
	
	}

}
