package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.apache.http.protocol.HTTP;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class GetRequestWithQueryParam {
	
	@Test
	public void tc3() throws IOException 
	{
		Properties pr=PropertiesFileLoad.propertiesFile();
        HTTPMethods http=new HTTPMethods(pr);
        Response res=http.GetRequestQueryParam("QA_URI","lastname" ,PostRequestTC.lastname); 
		System.out.println("******* Get Request data  with query parameter  is*************");
		
		System.out.println(res.asString());                                 
		System.out.println("Status Code is " +res.statusCode());
	System.out.println("                      ");
	System.out.println("*******************************************************************************");
	
	}

}
