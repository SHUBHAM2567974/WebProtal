package UI_WEB;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;
@Test(groups = "User- registration")            // GROUPING OF TEST Class 
public class BA_ClassandBA_Group  //// Class to write all testcase related to login
{    
	@BeforeClass
    public void beforClass()    
    
    {
	 System.out.println("Run this before class");
    }	
	
	
	@AfterClass
	public void afterClass()    
    
    {
	 System.out.println("Run this after class");
    }	
	@BeforeGroups(value="Regression")
	public void beforGroup()    
	
	{
		System.out.println("Run this before regression(group)");
	}	
	
	
	@AfterGroups (value="Regression")
	public void afterGroup()    
	
	{
		System.out.println("Run this after regression(group)");
	}	
	
	
	
	
	
     @Test(priority=1,groups="Regression")         // GROUPING OF TEST CASE
     public void atest1()    //  method to write test case 
     
     {
	 System.out.println("Test1 is successfully executed");
     }
     
     @Test(priority=2,groups="Regression")         // GROUPING OF TEST CASE
     public void atest2()    //  method to write test case 
     
     {
	 System.out.println("Test2 is successfully executed");
     }
     @Test(priority=3,groups={"Regression","bvt"})   // GROUPING OF TEST CASE
     public void atest3()    //  method to write test case 
     
     {
    	 System.out.println("Test3 is successfully executed");
     }
     @Test(priority=4,groups="bvt")               // GROUPING OF TEST CASE
     public void atest4()    //  method to write test case 
     
     {
    	 System.out.println("Test4 is successfully executed");
     }


}
