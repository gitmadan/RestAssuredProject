package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;

import com.jayway.restassured.response.Response;

import ResponseValidation.ResponseDataValidation;
import ResponseValidation.ResponseStatusCodeValidation;

public class GetRequestTC {
	
	public void tc2() throws IOException
	{
		Properties pr=PropertiesFileLoad.propertiesFile();                                 // properties file load
		HTTPMethods http=new HTTPMethods(pr);
		
		
		Response res=http.GetRequest("QA_URI",PostRequestTC.id); 
		System.out.println("*******Output of Get Request TC is *************");
		System.out.println(res.asString());                                                 // fetching id from tc1
		System.out.println("Status Code is " +res.statusCode());
		
		
		
		ResponseStatusCodeValidation.responseStatusCode(res, 200);
		//ResponseDataValidation.responseDataValidate(res, "API_testing","[17].domain" );
		System.out.println("                      ");
		System.out.println("*******************************************************************************");
		
	}
	}
		