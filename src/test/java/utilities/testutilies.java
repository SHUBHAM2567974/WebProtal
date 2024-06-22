/**
 * 
 */
package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Common.BaseTest;

/**
 * @author shubham
 *
 */
public class testutilies extends BaseTest{
	public void getScreenshot() throws IOException {
		Date currentdate = new Date();
		System.out.println(currentdate);
		String Screenshotfilename  = currentdate.toString().replace(" ","-").replace(":","-");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(screenshotFile, new File (".//screenshot123//"+Screenshotfilename+".png"));
        driver.manage().window().maximize();
	}
	

}
