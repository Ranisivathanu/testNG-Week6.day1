package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class Duplicatelead extends Commontest{
@Test
	public void duplicatelead()  {

		
	 driver.findElement(By.linkText("Create Lead")).click();
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("rani");
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sabarish");
	 driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("sabari");
	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Engineering");
	 driver.findElement(By.id("createLeadForm_description")).sendKeys("Music lover");
	 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arssabari143@gmail.com");
	 
	 WebElement State=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	 Select province	=new Select(State);
	 province.selectByVisibleText("New York");
	 
	 
	 driver.findElement(By.className("smallSubmit")).click();
	 
	 String createLead =driver.getTitle();
	 System.out.println("createLead");
	 

     driver.findElement(By.linkText("Duplicate Lead")).click();
	 WebElement company=driver.findElement(By.id("createLeadForm_companyName"));
	 company.clear();
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	 WebElement firstname=driver.findElement(By.id("createLeadForm_firstName"));
	 firstname.clear();
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sara");
       driver.findElement(By.className("smallSubmit")).click();
	 
	 String create2 =driver.getTitle();
	 System.out.println("create2");
	 



}}

