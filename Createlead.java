package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead extends Commontest {
	@Test
	public void createlead()  {
        
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("rani");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sabarish");
		 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("sabari");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Engineering");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Music lover");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arssabari143@gmail.com");
		 driver.findElement(By.className("smallSubmit")).click();
	
		 
		 
	}
}
