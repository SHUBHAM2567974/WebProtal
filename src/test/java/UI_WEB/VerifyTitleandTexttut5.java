package UI_WEB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleandTexttut5 { 
	
	@Test
	public void Titletest()
	{   
		SoftAssert softassert = new SoftAssert(); //So that full script get executed after typing message
		
		String ExpectedTitle = "Electronics, Cars and scooter , Fashion, Collectibles & More | eBay";
		String Expectedtext = "Search";
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options = new ChromeOptions();
		Options.setExperimentalOption("excludeSwitches", new String [] {"enable-automation"}); // chrome is controlled by automated software
		Options.addArguments("--remote-allow-origins=*");   // to solve chrome error 
		ChromeDriver driver = new ChromeDriver(Options);

		driver.get("https://www.ebay.com/");
		String Actualtitle = driver.getTitle();
		System.out.println("Verifying title");
//		Assert.assertEquals(Actualtitle, ExpectedTitle, "verifying title failed");
		softassert.assertEquals(Actualtitle, ExpectedTitle, "verifying title failed");
		String Actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		System.out.println("Verifying text");
//		Assert.assertEquals(Actualtext, Expectedtext, "verifying title failed ");
		softassert.assertEquals(Actualtext, Expectedtext, "verifying title failed ");
		System.out.println("Close window");
		driver.close();
		softassert.assertAll();
	}
}
