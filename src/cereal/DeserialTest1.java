package cereal;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class DeserialTest1 {
	public static void main(String[] args) throws IOException {
		
		Reader reader = new FileReader("demons/Ama5.json");
		
		GsonBuilder builder = new GsonBuilder();
		builder.registerTypeAdapter(Skills.class, new SkillsDeserializer());
		Gson gson = builder.create();
		
		Skills amaterasu = gson.fromJson(reader, Skills.class);
		
		System.out.println(amaterasu.ListOfSkills.size());
		System.out.println(amaterasu.ListOfSkills.toString());
		System.out.println(amaterasu.ListOfSkills.get(0).name);

	}
}

class Skills{
	public List<SingleSkill> ListOfSkills; 
}

class SingleSkill{
	public String name;
	public int level;
}

class SkillsDeserializer implements JsonDeserializer<Skills>{

	@Override
	public Skills deserialize(JsonElement arg0, Type arg1, JsonDeserializationContext arg2) throws JsonParseException {
		// TODO Auto-generated method stub
		JsonObject obj = arg0.getAsJsonObject();
		
		List<SingleSkill> Skillz = new ArrayList<>();
		
		for(Map.Entry<String, JsonElement> entry : obj.entrySet()){
			SingleSkill skl = new SingleSkill();
			skl.name = entry.getKey();
			skl.level = entry.getValue().getAsInt();
			Skillz.add(skl);
		}
		
		Skills skills = new Skills();
		skills.ListOfSkills = Skillz;
		
		return skills;
	}
	
}