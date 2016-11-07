package demonize;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class Create {
	public static void main(String[] args) throws IOException {
		Gson gson = new Gson();
	    
	    Reader reader = new FileReader("demons/Ama1.json");
	    
	    Demon amaterasu = gson.fromJson(reader, Demon.class);
	    reader.close();
	    System.out.println(amaterasu.toString());
	    
	    System.exit(0);
	}
}
