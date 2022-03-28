package week6day1;

import org.testng.annotations.Test;

public class AttributetestNG {
	@Test(priority=3,dependsOnMethods ="week6day1.Dependanceonmethod.office")
	public void student() {
		System.out.println("I am an engineering student");
	}
	
	@Test(priority=1)
	public void colledge() {
		System.out.println("I studied in Anna university");
	}
	@Test(priority=4,invocationCount=3, threadPoolSize=1)
	public void course() {
		System.out.println("I select mechanical engineering");
	}
	
	@Test(priority=2,enabled=false)
	public void location(){
	 System.out.println("It is located in chennai");
		
	}
	
}
