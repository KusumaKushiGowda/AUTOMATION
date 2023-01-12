package TestNgDemo.Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
	public void onStart(ITestContext arg0)
	{
		System.out.println("Test case started");
	}
	public void onTestStart(ITestResult arg0)
	{
		System.out.println(arg0.getMethod()+"test case started");
	}
	public void onTestSucess(ITestResult result)
	{
		System.out.println("test case has success");
	}
	public void onTestSkipped(ITestResult arg0)
	{
		System.out.println("test case skipped");
	}
	public void onTestFailure(ITestResult arg0)
	{
		System.out.println(arg0.getMethod()+"test case Failure");
	}
	public void onTestFinish(ITestResult arg0)
	{
		System.out.println(arg0.getMethod()+"test case Finished");
	}
}
