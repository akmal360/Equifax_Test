package testCase;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.PayLoad;

public class T001_Get {

	RequestSpecification httpRequest;
	Response response;

	@Test(priority = 1)
	public void urlCheck() {
		RestAssured.baseURI = "http://v2eok.mocklab.io/customer/";
		// request object
		httpRequest = RestAssured.given();
		// response object
		response = httpRequest.request(Method.GET, "/a");
		// print response
		String responBody = response.getBody().asString();
		System.out.println("Response Body is : " + responBody);
		// status code validation

		int statusCode = response.getStatusCode();
		System.out.println("Status code is : " + statusCode);
		Assert.assertEquals(statusCode, 200);
		// status line
		String statusLine = response.getStatusLine();
		System.out.println("Status line :" + statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

	}

	@Test(priority = 2)
	public void test2() throws JsonProcessingException {
		PayLoad payLoad1 = new PayLoad(1, "Akmal", "Hossain", 40, "M");
		ObjectMapper objMap = new ObjectMapper();
		String data1 = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(payLoad1);
		System.out.println(data1);

	}

	@Test(priority = 3)
	public void idCheck() throws JsonProcessingException {
		PayLoad payLoad1 = new PayLoad(2, "Akmal", "Hossain", 40, "M");
		ObjectMapper objMap = new ObjectMapper();
		String data1 = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(payLoad1);
		System.out.println(data1);

		int id = payLoad1.getId();
		System.out.println(id);

		if (id <= 10) {
			System.out.println("ID is checked ");
		} else {
			System.out.println("ID should not greter then zeor");
		}

	}

	@Test(priority = 4)
	public void firstNameCheck() throws JsonProcessingException {

		PayLoad payLoad1 = new PayLoad(2, "Akmaldfsfsfssfs", "Hossain", 40, "M");
		ObjectMapper objMap = new ObjectMapper();
		String data1 = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(payLoad1);
		System.out.println(data1);

		String firstName = payLoad1.getName();
		System.out.println(firstName);
		int firstNameLength = firstName.length();
		if (firstNameLength < 10) {
			System.out.println("checked");
		} else {
			System.out.println("Chracter should not more then 10");
		}

	}

	@Test(priority = 5)
	public void lastNameCheck() throws JsonProcessingException {
		PayLoad payLoad1 = new PayLoad(2, "Akmaldfsfsfssfs", "Hossain", 40, "M");
		ObjectMapper objMap = new ObjectMapper();
		String data1 = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(payLoad1);
		System.out.println(data1);

		String lastName = payLoad1.getLast();
		System.out.println(lastName);
		int firstNameLength = lastName.length();
		if (firstNameLength < 10) {
			System.out.println("checked");
		} else {
			System.out.println("Chracter should not more then 10");
		}

	}

	@Test(priority = 6)
	public void ageCheck() throws JsonProcessingException {

		PayLoad payLoad1 = new PayLoad(2, "Akmaldfsfsfssfs", "Hossain", 40, "M");
		ObjectMapper objMap = new ObjectMapper();
		String data1 = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(payLoad1);
		System.out.println(data1);

		int age = payLoad1.getAge();
		System.out.println(age);

		if (age > 0 && age < 120) {
			System.out.println("checked");
		} else {
			System.out.println("Age should be Greater then 0 and less the 120");
		}

	}
	@Test
	public void genderCheck() throws JsonProcessingException {
		PayLoad payLoad1 = new PayLoad(2, "Akmaldfsfsfssfs", "Hossain", 40, "M");
		ObjectMapper objMap = new ObjectMapper();
		String data1 = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(payLoad1);
		System.out.println(data1);

		String gender = payLoad1.getGender();
		System.out.println(gender);
		
		if (gender=="M" || gender == "F" || gender =="m"|| gender=="f") {
			System.out.println("checked");
		} else {
			System.out.println("Gender should be M or F or m or f");
		}

	}
}
