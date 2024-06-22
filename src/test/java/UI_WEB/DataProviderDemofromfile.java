package UI_WEB;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
            
public class DataProviderDemofromfile  
{

	@DataProvider(name="create")               ///1st data provider
	public Object[][] dataset1(Method m)
	{
	Object[][] testdata = null;
	if(m.getName().equals("test1"))
	{   testdata= new Object[][]{
		{"username1","password1"},
		{"username2","password2"},
		{"username3","password3"}};
	}
	else if(m.getName().equals("test"))
	
			{
		testdata= new Object[][]{
		{"username1","password1","test1"},
		{"username2","password2","test2"},
		{"username3","password3","test3"}};
			}

	
	 return testdata;
	}
}


