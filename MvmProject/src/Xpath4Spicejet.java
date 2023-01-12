import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpath4Spicejet 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']/div[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Passengers')]")).click();
		WebElement adultplus = driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
		for(int i=0;i<3;i++)
		{
			adultplus.click();
		}
		String count=driver.findElement(By.xpath("//div[@data-testid='Adult-testID-minus-one-cta']/following-sibling::div[1]/div")).getText();
		String s=count.equals("4")?"correct num of passengers":"Incorrect num of passengers";
		System.out.println(s);
		
	
		WebElement Children = driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']"));
		for(int i=0;i<4;i++)
		{
			Children.click();
		}
		String count1=driver.findElement(By.xpath("//div[@data-testid='Children-testID-minus-one-cta']/preceding-sibling::div[1]/div")).getText();
		String s1=count1.equals("5")?"correct num of passengers":"Incorrect num of passengers";
		System.out.println(s1);
	}
}