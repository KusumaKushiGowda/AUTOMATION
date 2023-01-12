package DEMOTEST1.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ALLANOTATIONSWRK 
{
	@BeforeSuite
	public void AmazonSeTup()
	{
		System.out.println("The AmazonSeTup process is completed");
	}
	@Test
	public void AmazonLogin()
	{
		System.out.println("The AmazonLogin Process is entered");
	}
	
	@BeforeClass
	public void VerifyLogin()
	{
		System.out.println("The VerifyLogin process is verified");
	}
	
	@BeforeMethod
	public void HomePage()
	{
		System.out.println("Selected the item in HomePage");
	}
	@AfterMethod
	public void AddToCart()
	{
		System.out.println("AddToCart Page is seen");
	}
	@AfterClass
	public void PaymentProcess()
	{
		System.out.println("PaymentProcess is completed");
	}
	@AfterSuite
	public void OrderConfirm()
	{
		System.out.println("Order Confirmation is proceed");
	}

}
