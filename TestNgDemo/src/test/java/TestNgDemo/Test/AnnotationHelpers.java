package TestNgDemo.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationHelpers 
{
	@Test(timeOut=5000)//wait for 5 second before failing
	public void create() 
	{
		System.out.println("inside create Testcase");
	}
	@Test(enabled=true)
	public void select()
	{
		Assert.assertTrue(false);//failing the testcase
		System.out.println("inside select Testcase");
	}
	@Test(dependsOnMethods= {"select"})
	public void delete()
	{
		System.out.println("inside delete Testcase");
	}

}
