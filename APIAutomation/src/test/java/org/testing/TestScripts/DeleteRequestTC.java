package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;

import com.jayway.restassured.response.Response;

import ResponseValidation.ResponseStatusCodeValidation;

public class DeleteRequestTC {
	
	public void tc6() throws IOException {
	
	Properties pr=PropertiesFileLoad.propertiesFile();
	HTTPMethods http=new HTTPMethods(pr);
	
	Response res=http.DeleteRequest("QA_URI", "QXM7Njz");
	Response res1=http.DeleteRequest("QA_URI", "vrQQOv7");
	Response res2=http.DeleteRequest("QA_URI", "geet1234");
	Response res3=http.DeleteRequest("QA_URI", "5HqesTH");
	Response res4=http.DeleteRequest("QA_URI", "462690008");
	Response res5=http.DeleteRequest("QA_URI", "-880816069");
	System.out.println("********** Delete Request Executed****");
	ResponseStatusCodeValidation.responseStatusCode(res, 200);
	System.out.println("Status code is " +res.getStatusCode());
	System.out.println("Data deleted successfully");
	System.out.println("                      ");
	System.out.println("*******************************************************************************");
	
	}
	
}
