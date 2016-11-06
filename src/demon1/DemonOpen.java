package demon1;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DemonOpen {
	public static void main(String[] args) throws IOException {
		GsonBuilder builder = new GsonBuilder();
		builder.serializeNulls();
		builder.setPrettyPrinting().serializeNulls();
	    Gson gson = builder.create();
	    
	    Reader reader = new FileReader("demons/Ama1.json");
	    
	    Demon amaterasu = gson.fromJson(reader, Demon.class);
	    reader.close();
	    System.out.println(amaterasu.toString());
	    
	}
}
