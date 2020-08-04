package ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseDataValidation {
	
	public static void responseDataValidate( Response res , String expectedData, String jsonPath)
	{
		if(res.jsonPath().get(jsonPath).equals(expectedData))
		{
			System.out.println("Data is Matching");
		}
		else
		{
			System.out.println("data is not matching");
		}
	}

}
