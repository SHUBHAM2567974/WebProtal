/**
 * 
 */
package UI_WEB;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseTest;

/**
 * @author shubham
 *
 */
public class Listenerdemotest extends BaseTest {
	      @Test(retryAnalyzer = Common.MyRetry.class)
	      public void launchApp()
	      {
	    	  driver.get("https://www.ebay.com/");
	    	  Assert.assertTrue(false);
	      }
}
