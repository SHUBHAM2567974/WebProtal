package UI_WEB;

import org.testng.annotations.Test;

public class LoginTest1  //// Class to write all testcase related to login
{
     @Test(priority=2,description="This is login test")
     public void Logintest()    //  method to write test case 
     
     {
	 System.out.println("Login is successful");
     }
     
     @Test(priority=1,description="This is logout test")
     public void Logouttest()    //  method to write test case 
     
     {
	 System.out.println("Logout  is successful");
     }


}
