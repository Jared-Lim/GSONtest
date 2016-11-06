package demon1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DemonOpen {
	public static void main(String[] args) {
		GsonBuilder builder = new GsonBuilder();
		builder.serializeNulls();
		builder.setPrettyPrinting().serializeNulls();
	    Gson gson = builder.create();
	}
}
