package sdfc_utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import sdfc_Configs.TestConstants;

public class Data_Utilities {

	public String readAccountsProperties(String provideKey) throws IOException 
	{
		
		System.out.println("inside account properties");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(TestConstants.sAccountPropertiesPath);
		prop.load(fis);
		System.out.println("providekey" + provideKey);
		return prop.getProperty(provideKey);		
		
	}
	
	public String readValidationText(String provideKey) throws IOException 
	{
		
		System.out.println("inside Read Validation properties");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(TestConstants.sValidationTextPropertiesPath);
		prop.load(fis);
		System.out.println("providekey");
		return prop.getProperty(provideKey);
	}
}
