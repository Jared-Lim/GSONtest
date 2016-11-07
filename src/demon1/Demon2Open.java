package demon1;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class Demon2Open {
	public static void main(String[] args) throws IOException {
	    Gson gson = new Gson();
	    
	    Reader reader = new FileReader("demons/Ama2-2.json");
	    
	    Demon2 amaterasu = gson.fromJson(reader, Demon2.class);
	    reader.close();
	    System.out.println(amaterasu.toString());
	    
	    System.exit(0);
	}
}
