package UI_WEB;

import org.testng.annotations.Test;
@Test(groups = "User- registration")            // GROUPING OF TEST Class 
public class GroupDemo  //// Class to write all testcase related to login
{
     @Test(priority=2,groups="Regression")         // GROUPING OF TEST CASE
     public void atest1()    //  method to write test case 
     
     {
	 System.out.println("Login is successful");
     }
     
     @Test(priority=1,groups="Regression")         // GROUPING OF TEST CASE
     public void atest2()    //  method to write test case 
     
     {
	 System.out.println("Logout  is successful");
     }
     @Test(priority=1,groups={"Regression","bvt"})   // GROUPING OF TEST CASE
     public void atest3()    //  method to write test case 
     
     {
    	 System.out.println("Logout  is successful");
     }
     @Test(priority=1,groups="bvt")               // GROUPING OF TEST CASE
     public void atest4()    //  method to write test case 
     
     {
    	 System.out.println("Logout  is successful");
     }


}
