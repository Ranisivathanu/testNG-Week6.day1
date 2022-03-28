package week6.day1;

import org.testng.annotations.Test;

public class Dependanceonmethod {
	@Test
	public void office() {
		System.out.println("Working in MNC");
		
	}
	@Test(dependsOnMethods ="office")
	public void culture() {
		System.out.println("modern culture");
		
	}
	@Test
	public void standard() {
		System.out.println("Top level");
	}
}
