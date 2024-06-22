package UI_WEB;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
            
public class DataProviderDemotest2  {
	@Test(dataProvider="create")

	public void test(String username,String password)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options = new ChromeOptions();
		Options.setExperimentalOption("excludeSwitches", new String [] {"enable-automation"}); // chrome is controlled by automated software
		Options.addArguments("--remote-allow-origins=*");   // to solve chrome error 
		ChromeDriver driver = new ChromeDriver(Options);

		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		
	}
	@DataProvider(name="create")
	public Object[][] dataset1()
	{
	return new Object[][] {
		{"standard_user","secret_sauce"},
		{"locked_out_user","secret_sauce"},
		{"problem_user","secret_sauce"},
		{"performance_glitch_user","secret_sauce"}};
		
	}
//	@Test(dataProvider="dataset")
//	public void test(String username,String password)
//	{
//		System.out.println(username+"====="+password);
//	}
//	@DataProvider
//	public Object[][] dataset()
//	{
//		Object[][]dataset = new Object[4][2];
//		//first row
//		dataset[0][0] = "user1";
//		dataset[0][1] = "pass1";
//		//second row
//		dataset[1][0] = "user2";
//		dataset[1][1] = "pass2";
//		//third row
//		dataset[3][0] = "user3";
//		dataset[3][1] = "pass3";
//		//Forth  row
//		dataset[4][0] = "user4";
//		dataset[4][1] = "pass4";
//		
//	return dataset;
//	}
	


}
