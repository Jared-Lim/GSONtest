package gerson3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestUser {
	public static void main(String[] args) {
		UserSimple userObject = new UserSimple();
		userObject.name="Norman";
		userObject.email="norman@futurestud.io";
		userObject.age=26;
		userObject.isDeveloper=true;
		
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Gson gson = builder.create();
		String userJson = gson.toJson(userObject);
		System.out.println(userJson);
	}
}
