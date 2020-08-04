package org.testing.TestSteps;

import java.util.Properties;

import com.google.gson.JsonObject;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class HTTPMethods {
	//uri--> env properties
	
	Properties pr;
	public HTTPMethods( Properties pr)
	{
		this.pr=pr;
	}
	
  public Response Postrequest( String bodyData , String UriKey )
  {
	  Response res=given()
	  .contentType(ContentType.JSON)
	  .body(bodyData)
	  .when()
	  .post(pr.getProperty(UriKey));
	 	  return res;
	  
  }
  
  public Response GetRequest(String UriKey , String Endpoint)
    {
	String uri=pr.getProperty(UriKey)+"/"+Endpoint;
	System.out.println("uri is " +uri);
	Response res=given()
			.contentType(ContentType.JSON)
			.when()
			.get(uri);
	return res;
}
  
  public Response GetRequestQueryParam(String UriKey , String  queryParam, String paramValue)
  {
	String uri=pr.getProperty(UriKey)+"?"+queryParam+"="+paramValue;
	System.out.println("uri is " +uri);
	Response res=given()
			.contentType(ContentType.JSON)
			.when()
			.get(uri);
	return res;
}
  public Response PutRequest(String putData , String  UriKey, String Endpoint)
  {
	
	String uri=pr.getProperty(UriKey)+"/"+Endpoint;
	System.out.println("uri is " +uri);	
	Response res=given()
			.contentType(ContentType.JSON)
			.body(putData)
			.when()
			.put(uri);
	return res;
}
  
  public Response PatchRequest(String bodyData , String UriKey , String  Endpoint)
  {
	
	String uri=pr.getProperty(UriKey)+"/"+Endpoint;
	System.out.println("uri is " +uri);	
	Response res=given()
			.contentType(ContentType.JSON)	
			.body(bodyData)
			.when()
			.patch(uri);
	return res;
}
  
  public Response DeleteRequest(String  UriKey, String Endpoint)
  {
	
	String uri=pr.getProperty(UriKey)+"/"+Endpoint;
	System.out.println("uri is " +uri);	
	Response res=given()
			.contentType(ContentType.JSON)
			.when()
			.put(uri);
	return res;
}
  
}
