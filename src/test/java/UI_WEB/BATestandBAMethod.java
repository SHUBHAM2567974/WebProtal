package UI_WEB;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BATestandBAMethod
{    
	@BeforeTest
	public void LogintoAppliction()
	{
		System.out.println("Login to Applictaion");
	}
	@AfterTest
	public void LogoutfromApplication()
	{
		System.out.println("Logout from Application");
	}
	
	
     @Test(priority=1,description="This is login test")
     public void test1()    //  method to write test case 
     
     {
	 System.out.println("Test1");
     }
 	@BeforeMethod                          // Before Method
 	public void ConnectDB()
 	{
 		System.out.println("ConnectDb");
 	}
 	@AfterMethod                           // After method
 	public void DisconnectDB()
 	{
 		System.out.println("DisconnectDb");
 	}
     @Test(priority=2,description="This is logout test")
     public void test2()    //  method to write test case 
     
     {
	 System.out.println("Test2");
     }


}
