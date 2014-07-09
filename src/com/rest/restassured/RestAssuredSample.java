package com.rest.restassured;

import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.containsString;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;


public class RestAssuredSample {
	String Message="hi this is restassured class 2nd time";
	String facebookToken="CAAFaAg2llCUBADkgUDRAInyjH4ZCymSDvNnl4JuS2yGb1zh1wMY9a5NcPbEaRauAdIbosW85nNKk1ZA5Eia7fEjvAgjs8hwUAZAslsZC81wZBUxCL6Qyc1G31vRjrEGJkvcQQzGblZCZAqL8P1NNlFRSvyzD3dUZAJ56NTpReAUxhGeBimIaDZBIHvh4G73rY11sZD";
	int expectedStatus =200;
@Test
public void facebookTest()
{
	
	System.out.println("https://graph.facebook.com/100007391863860/feed?message="+"'"+Message+"'"+"&access_token="+facebookToken);
	Response res=expect().statusCode(expectedStatus).when().post("https://graph.facebook.com/100007391863860/feed?message="+"'"+Message+"'"+"&access_token="+facebookToken);
	System.out.println(res);
}

@Test
public void jsonTest()
{
	Response res1=expect().body(containsString("Directed by Michael Bay")).get("http://graph.facebook.com/?%20%20%20ids=http://www.imdb.com/title/tt0117500/");
	System.out.println(res1);
}

}
