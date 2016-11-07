package demon1;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class Demon3Open {
	public static void main(String[] args) throws IOException {
	    Gson gson = new Gson();
	    
	    Reader reader = new FileReader("demons/Ama2-3.json");
	    
	    Demon3 amaterasu = gson.fromJson(reader, Demon3.class);
	    reader.close();
	    System.out.println(amaterasu.toString());
	    
	    System.exit(0);
	}
}
