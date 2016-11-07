package demon1;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class AffOpen {
	public static void main(String[] args) throws IOException {
	    Gson gson = new Gson();
	    
	    Reader reader = new FileReader("demons/Ama4.json");
	    
	    Affinities amaterasu = gson.fromJson(reader, Affinities.class);
	    reader.close();
	    System.out.println(amaterasu.toString());
	    
	}
}
