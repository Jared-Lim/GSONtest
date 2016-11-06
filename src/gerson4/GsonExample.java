package gerson4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GsonExample {

    public static void main(String[] args) {

        Staff staff = createDummyObject();

        //1. Convert object to JSON string
        GsonBuilder builder = new GsonBuilder();
		builder.serializeNulls();
		builder.setPrettyPrinting().serializeNulls();
        Gson gson = builder.create();
        //Gson gson = new Gson();
        String json = gson.toJson(staff);
        System.out.println(json);

        //2. Convert object to JSON string and save into a file directly
        try (FileWriter writer = new FileWriter("resources/testJSON/staff.json")) {

            gson.toJson(staff, writer);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        

    }

    private static Staff createDummyObject() {

        Staff staff = new Staff();
        System.out.println(staff);

        staff.setName("mkyong");
        staff.setAge(35);
        staff.setPosition("Founder");
        staff.setSalary(new BigDecimal("10000"));

        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("python");
        skills.add("shell");

        staff.setSkills(skills);

        return staff;

    }

}