import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo2 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		
		driver.get("https://letcode.in/test");
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		waitForLoad(3);
		driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Kusuma");
		driver.findElement(By.xpath("//input[@value='I am good']")).sendKeys("kushi");
		String txt=driver.findElement(By.xpath("//input[@id='getMe']")).getAttribute("value");
		System.out.println(txt);
		driver.findElement(By.xpath("//input[@id='clearMe']")).clear();
		boolean check=driver.findElement(By.xpath("//input[@id='noEdit']")).isEnabled();
		String s=check?"field is enabled":"field is disabled";
		System.out.println(s);
		
		
		boolean check2=driver.findElement(By.xpath("//input[@id='dontwrite']")).isEnabled();
		if(check2)
		{
			driver.findElement(By.xpath("//input[@id='dontwrite']")).sendKeys("");
		}
		else
		{
			System.out.println("It is read only");
		}
	
}
	public static void waitForLoad(int second)
	{
		try {
			Thread.sleep(second*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
