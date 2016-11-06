package gerson4;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Gson3Example {

    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();

        Reader reader = new FileReader("resources/testJSON/staff.json");

		// Convert JSON to Java Object
		Staff staff = gson.fromJson(reader, Staff.class);
		reader.close();
		System.out.println(staff);
		
		reader = new FileReader("resources/testJSON/staff.json");
		// Convert JSON to JsonElement, and later to String
		JsonElement json = gson.fromJson(reader, JsonElement.class);
		String jsonInString = gson.toJson(json);
		System.out.println(jsonInString);

    }

}