import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeBrowser1 
{
	public static void main(String[] args) {
		String url="https://www.flipkart.com/";
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Kusuma\\OneDrive\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();//maximize
		
		driver.get(url);
		
		String currentUrl= driver.getCurrentUrl();
		System.out.println("currentUrl="+currentUrl);
		
		if(url.equals(currentUrl))
		{
			System.out.println("urls are same");
		}
		else
		{
			System.out.println("url are not same");
		}
		String title= driver.getTitle();
		System.out.println("title="+title);
	}
}
