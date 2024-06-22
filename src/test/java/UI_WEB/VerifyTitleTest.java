package UI_WEB;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest { 
	
	@Test
	public void Titletest()
	{   
		String ExpectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options = new ChromeOptions();
		Options.setExperimentalOption("excludeSwitches", new String [] {"enable-automation"}); // chrome is controlled by automated software
		Options.addArguments("--remote-allow-origins=*");   // to solve chrome error 
		ChromeDriver driver = new ChromeDriver(Options);

		driver.get("https://www.ebay.com/");
		String Actualtitle = driver.getTitle();
		
		Assert.assertEquals(Actualtitle, ExpectedTitle);
	}
}
