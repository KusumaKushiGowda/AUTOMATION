package TestNgDemo.Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametDemo 
{
	@Parameters({"url"})
	@Test
	public void SetLanguage(String newurl)
		{
			System.out.println("inside the setLanguage");
			System.out.println(newurl);
		}
	@Parameters({"url","username","Password"})
	@Test
	public void SetCountry(String Countryurl,String Pasurl,String Usurl)
	{
		System.out.println("inside the SetCountry");
		System.out.println("url= "+Countryurl);
		System.out.println("Password= "+Pasurl);
		System.out.println("username= "+Usurl);
	}

	}


