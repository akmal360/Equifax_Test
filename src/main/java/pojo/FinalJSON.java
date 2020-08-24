package pojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class FinalJSON {

	public static void main(String[] args) {
		PayLoad payLoad1 = new PayLoad(10, "Akmal", "Hossain", 40, "M");
		//PayLoad payLoad2 = new PayLoad(2, "Akmal", "Hossain", 40, "F");

		ObjectMapper objMap = new ObjectMapper();
		try {
			String data1 = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(payLoad1);
			//String data2 = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(payLoad2);
			System.out.println(data1);
			//System.out.println(data2);
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}
		
		//check
		

	}
}
