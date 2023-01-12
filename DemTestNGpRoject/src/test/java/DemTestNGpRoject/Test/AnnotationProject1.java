package DemTestNGpRoject.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class AnnotationProject1 
{
	public WebDriver driver;
    public String url="https://www.saucedemo.com/";
    
@BeforeSuite
public void setUp()
{   
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\navyug\\workspace\\QAPractise\\src\\ChromeDriver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    System.out.println("The setUp process is completed");
}

@BeforeTest
public void profileSetup()
{
    driver.manage().window().maximize();
    System.out.println("The profilesetup process is completed"); 
}
@BeforeClass
public void appSetup()
{
    driver.get(url);
    System.out.println("The appSetup process is completed");
}

@BeforeMethod
public void checkLogin()
{
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys("standards_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
    System.out.println("The login process on Saucedemo is completed");
}

@Test(groups="urlValidation")
public void testCurrentUrl()
{
	WebElement err=driver.findElement(By.xpath("//div[@class='error-message-container error']/h3"));
	String errMsg=err.getText();
	System.out.println("The error msg is"+errMsg);
	driver.findElement(By.xpath("//div[@class='error-message-container error']/h3/button")).click();
    System.out.println("The url validation test is completed");
}

@AfterMethod
public void Products() throws InterruptedException
{
	String[] items= {"Bolt T-Shirt","Bike Light","Onesie"};
	for(int i=0;i<items.length;i++)
	{
		driver.findElement(By.xpath("//*[contains(text(),'"+items[i]+"')]/parent::a/parent::div/following-sibling::div[@class='pricebar']/button")).click();
		
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a")).click();
    System.out.println("Products of the test is taken");
}

@AfterClass
public void ContinueShoping()
{
	driver.findElement(By.xpath("//button[@data-test='continue-shopping']")).click();

    System.out.println("The ContinueShoping process is completed");
}

@AfterTest
public void reportReady()
{
    System.out.println("Report is ready to be shared, with screenshots of tests");
}

@AfterSuite
public void cleanUp()
{ 
    System.out.println("All close up activities completed");
}

@BeforeGroups("urlValidation")
public void setUpSecurity() {
    System.out.println("url validation test starting");
}

@AfterGroups("urlValidation")
public void tearDownSecurity() {
    System.out.println("url validation test finished");
}
}

    