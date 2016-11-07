package cereal;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class DeserialTest1 {

}

class Skills{
	public List<SingleSkill> ListOfSkills; 
}

class SingleSkill{
	
}

class SkillsDeserializer implements JsonDeserializer<Skills>{

	@Override
	public Skills deserialize(JsonElement arg0, Type arg1, JsonDeserializationContext arg2) throws JsonParseException {
		// TODO Auto-generated method stub
		JsonArray jArray = (JsonArray) arg0;
		
		
		
		
		return null;
	}
	
}