package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import com.jayway.restassured.response.Response;

import ResponseValidation.ResponseDataValidation;
import ResponseValidation.ResponseStatusCodeValidation;

public class PatchRequestTC {
	
	@Test
	public void tc5() throws IOException {
		
		JSONObject patchValue=new JSONObject();
		String body=patchValue.put("firstname","patch_test").toString();
		
		Properties pr=PropertiesFileLoad.propertiesFile();
		HTTPMethods http=new HTTPMethods(pr);
		
		Response res=http.PatchRequest(body,"QA_URI", PostRequestTC.id);
		System.out.println("**********Patch request executed**********");
		System.out.println("Status code is " +res.getStatusCode());
		ResponseStatusCodeValidation.responseStatusCode(res, 200);
		//ResponseDataValidation.responseDataValidate(res, "Patch_test", "firstname"); // quiz.[]options[3]
		System.out.println(res.asString());
		System.out.println("                      ");
		System.out.println("*******************************************************************************");
		
		
		

}
}