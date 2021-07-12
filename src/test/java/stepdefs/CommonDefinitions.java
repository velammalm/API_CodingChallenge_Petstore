package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import endpoints.BaseEndpoints;
import io.restassured.RestAssured;

public class CommonDefinitions {
	
	private Base base;
	private BaseEndpoints be = new BaseEndpoints();
	
	public CommonDefinitions(Base base) {
		this.base = base;
	}
	
	@Given("^the Swagger Petstore API is available$") 
	public void the_swagger_petstore_api_is_available() {
		String url = be.getBaseUrl() + "swagger.json";
		be.sendRequest(null, BaseEndpoints.GET_REQUEST, url, null).then().statusCode(200);
	}
	
	@Then("^the requests response will contain the value '(.*?)' for the '(.*?)' field$")
	public void i_will_be_able_to_run_connected_step_definitions(String val, String key) {
		be.verifyResponseKeyValues(key, val, base.getResponse());
	}

}
