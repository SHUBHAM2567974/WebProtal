package UI_WEB;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skiptestcasetut8
{    Boolean datasetup = false;
     @Test(enabled = false)
     public void test1()                    //  1st way to skip tescase
     
     {
	 System.out.println("Skipping due to incomplete");
     }
     
     @Test
     public void test2()                       // ##ANOTHER WAY TO SKIP TEST##
     
     {
	 System.out.println("Skiping this testcase forcefully");
	 throw new SkipException("Skipping this testcase");
	 
     }
     @Test
     public void test3()                        //****CONDITIONS****//
     
     {
    	 System.out.println("Skiiping this testcase due to condition");  //CONDITIONS
    	 if(datasetup == true)
    	 {
    		 System.out.println("Execute further steps");
    		 
    		 
    	 }
    	 else
    	 {
    		 System.out.println("Do not execute further steps");
    		 throw new SkipException("Skipping this testcase beacause of condition");
    		 
    	 }
     }


}
