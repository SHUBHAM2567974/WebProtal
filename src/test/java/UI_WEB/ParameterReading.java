package UI_WEB;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ParameterReading {
	public static WebDriver driver;
	//public static String browser = "chrome";//Reading from Testng suite excel,csv
	
@Parameters({"browser"} )    
@Test 
public void launchApplication(String browser){
		
		if (browser.equals("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions Options = new ChromeOptions();
			Options.setExperimentalOption("excludeSwitches", new String [] {"enable-automation"}); // chrome is controlled by automated software
			Options.addArguments("--remote-allow-origins=*");   // to solve chrome error 
			ChromeDriver driver = new ChromeDriver(Options);
		}
		else if(browser.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			
		}
		// TODO Auto-generated method stub

		
		driver.get("https:/saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]")).click();
		driver.findElement(By.id("login-button")).click();		
		
		driver.close();
	}

}
