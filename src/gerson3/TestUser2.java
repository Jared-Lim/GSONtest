package gerson3;

import com.google.gson.Gson;

public class TestUser2 {
	public static void main(String[] args) {
		String userJson = "{'age':26,'email':'norman@futurestud.io','isDeveloper':true,'name':'Norman'}";
		Gson gson = new Gson();
		UserSimple userObject = gson.fromJson(userJson, UserSimple.class);
		System.out.println(userObject.name);
		System.out.println(userObject.email);
		System.out.println(userObject.age);
		System.out.println(userObject.isDeveloper);
	}
}
