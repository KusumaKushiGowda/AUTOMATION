import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathDemo3 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		
		driver.get("https://letcode.in/test");
		driver.findElement(By.xpath("//a[text()='Click']")).click();
		driver.findElement(By.xpath("//*[@id='home']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		WebElement FindLocation=driver.findElement(By.xpath("//button[@id='position']"));
		FindLocation.getLocation();
		FindLocation.click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='color']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='property']")).click();

		
		boolean check =driver.findElement(By.id("//button[@id='isDisabled']")).isEnabled();
		String s=check ?"field is enabled":"field is disabled";
		System.out.println(s);
}
}
