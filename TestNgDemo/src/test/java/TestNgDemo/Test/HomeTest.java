package TestNgDemo.Test;

import org.testng.annotations.Test;

public class HomeTest 
{
	@Test(groups= {"sanity","smoke"})
	public void verifySearchbar()
	{
		System.out.println("inside verify search bar");
	}
	@Test
	public void addtoCart()
	{
		System.out.println("insdie add to cart");
		
	}
	@Test
	public void checkforLinks()
	{
		System.out.println("inside check for links");
	}

}
