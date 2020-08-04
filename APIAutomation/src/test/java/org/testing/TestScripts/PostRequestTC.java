package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonFileRead;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesFileLoad;
import org.testing.utilities.ResponseExtractionUsingJsonPath;

import com.jayway.restassured.response.Response;

import ResponseValidation.ResponseDataValidation;
import ResponseValidation.ResponseStatusCodeValidation;

//need body data for post request - using existing json 
//random number generate -> variable value replacement
//properties file load
public class PostRequestTC {
	static String id;
	static String lastname;
	public void tc1() throws IOException {
		
	String Payload=JsonFileRead.bodyDataRead("../APIAutomation/Payload.json");    // reading existing json for payload
	
	Random r=new Random();                                                          // random Id generate
	Integer n=r.nextInt();
	Payload=JsonVariableReplacement.jsonVariable(Payload, "id", n.toString()); 
	Payload=JsonVariableReplacement.jsonVariable(Payload, "lastname", "gitikaMadanPahuja");
	//System.out.println(Payload); // to print data
	
	Properties pr=PropertiesFileLoad.propertiesFile();                                 // properties file load
	HTTPMethods http=new HTTPMethods(pr);
	
	Response res=http.Postrequest(Payload, "QA_URI");	
	System.out.println("status code is " +res.statusCode());                       
	System.out.println("Post Request Data is ");	
	System.out.println(res.asString());                                              // post request output
	
	/* Response Code validation*/
	ResponseStatusCodeValidation.responseStatusCode(res, 201);
	/*Response Data Validation*/
	ResponseDataValidation.responseDataValidate(res,"gitikaMadanPahuja" , "lastname");
	
	id=ResponseExtractionUsingJsonPath.responseExtract(res , "id");
	lastname=ResponseExtractionUsingJsonPath.responseExtract(res , "lastname");
	}
	
	
	 
	}


