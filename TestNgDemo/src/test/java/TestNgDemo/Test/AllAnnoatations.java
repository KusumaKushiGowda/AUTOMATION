package TestNgDemo.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnoatations 
{
	@BeforeSuite
	public void startSuite()
	{
		System.out.println("inside @BeforeSuite");
	}
	@Test
	public void TestCase1()
	{
		System.out.println("inside @BeforeTest");
	}
	
	@BeforeClass
	public void initializeVariable()
	{
		System.out.println("inside@BeforeClass");
	}
	
	@BeforeMethod
	public void printMethodStart()
	{
		System.out.println("inside @BeforeMethod");
	}
	@AfterMethod
	public void printMethodhalf()
	{
		System.out.println("inside @AfterMethod");
	}
	@AfterClass
	public void prinMethodStop()
	{
		System.out.println("insdie @afterClass");
	}
	@AfterSuite
	public void end()
	{
		System.out.println("inside @end");
	}

}
