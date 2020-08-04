package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;

import com.google.gson.JsonObject;
import com.jayway.restassured.response.Response;

import ResponseValidation.ResponseDataValidation;
import ResponseValidation.ResponseStatusCodeValidation;

public class PutRequestTC {
	public void tc4() throws IOException
	{
	JSONObject putData=new JSONObject();
	putData.put("firstname","Put_trial");
	
	Properties pr=PropertiesFileLoad.propertiesFile();
	HTTPMethods http=new HTTPMethods(pr);
	
	Response res= http.PutRequest(putData.toString(), "QA_URI", PostRequestTC.id);
	System.out.println("**************** Put request executed*********");
	ResponseStatusCodeValidation.responseStatusCode(res, 200);
	ResponseDataValidation.responseDataValidate(res, "Put_trial", "firstname");
	System.out.println(res.asString());
	System.out.println("                      ");
	System.out.println("*******************************************************************************");

}
}
