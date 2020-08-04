package ResponseValidation;

import com.jayway.restassured.response.Response;

public class ResponseStatusCodeValidation {
	
	public static void responseStatusCode(Response res, int expectedStatusCode)
	
	{
	if(res.getStatusCode()==expectedStatusCode)	
	{
		System.out.println("Status code is matching");
		
	}
	else
	{
		System.out.println("Status code  is not matching");
	}
	}
}
