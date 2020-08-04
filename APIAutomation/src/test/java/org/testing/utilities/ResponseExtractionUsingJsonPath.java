package org.testing.utilities;

import com.jayway.restassured.response.Response;

public class ResponseExtractionUsingJsonPath {
	
	public static String responseExtract(Response res , String jsonpath)
	{
	return res.jsonPath().get(jsonpath);
		
	}

}
