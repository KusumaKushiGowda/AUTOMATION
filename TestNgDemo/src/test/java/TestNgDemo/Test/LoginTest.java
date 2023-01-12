package TestNgDemo.Test;

import org.testng.annotations.Test;

public class LoginTest
{
	@Test(groups= {"sanity"})
	public void verifylogin()
	{
		System.out.println("check is completed");
	}
	public void verifylogout()
	{
		System.out.println("logout is completed");
	}
	@Test(groups= {"sanity"})
	public void verifyprocess()
	{
		System.out.println("verify process");
	}

}
