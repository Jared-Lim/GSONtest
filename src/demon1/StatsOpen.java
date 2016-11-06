package demon1;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class StatsOpen {
	public static void main(String[] args) throws IOException {
	    Gson gson = new Gson();
	    
	    Reader reader = new FileReader("demons/Ama3.json");
	    
	    Stats amaterasu = gson.fromJson(reader, Stats.class);
	    reader.close();
	    System.out.println(amaterasu.toString());
	    
	}
}
