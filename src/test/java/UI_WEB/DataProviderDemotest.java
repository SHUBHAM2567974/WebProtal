package UI_WEB;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
            
public class DataProviderDemotest  {
	@Test(dataProvider="dataset1",dataProviderClass=DataProviderDemofromfile.class)
	public void test1(String username,String password)
	{
		System.out.println(username+"====="+password);
	}
	@Test(dataProvider="dataset",dataProviderClass=DataProviderDemofromfile.class)
	public void test(String username,String password,String test2)
	{
		System.out.println(username+"====="+password+"===="+test2);
	}
	
	


}
