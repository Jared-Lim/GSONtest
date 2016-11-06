package gerson1;

import java.lang.reflect.Field;
import java.util.*;
//import org.apache.commons.io.IOUtils;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class JavaToJsonAndBack {
	public static void main(String[] args) {
		Albums albums = new Albums();
		albums.title = "Free Music Archive - Albums";
		albums.message = "";
		albums.total = "11259";
		albums.total_pages = 2252;
		albums.page = 1;
		albums.limit = "5";
		
		GsonBuilder builder = new GsonBuilder();
		builder.serializeNulls();
		builder.setPrettyPrinting().serializeNulls();
		builder.setFieldNamingStrategy(new FieldNamingStrategy() {
			 
            @Override
            public String translateName(Field f) {
                if (f.getName().equals("albumId"))
                    return "album_id";
                else
                    return f.getName();
            }
        });
		Gson gson = builder.create();
		//Albums albums2 = gson.fromJson(IOUtils.toString(new URL(url)), Albums.class);
		
		Dataset dataset = new Dataset();
		dataset.album_id = "7596";
		dataset.album_title = "Album 1";
		
		AlbumImages image = new AlbumImages();
		image.image_id = "1";
		image.albumId = "10";
		
		dataset.images.add(image);
		albums.dataset.add(dataset);
		
		System.out.println(gson.toJson(albums)); 
		//System.out.println(gson.toJson(dataset));
		//System.out.println(gson.toJson(image));
		
	}
}

class Albums {
    public String title;
    public String message;
    public List<String> errors = new ArrayList<String>();
    public String total;
    public int total_pages;
    public int page;
    public String limit;
    List<Dataset> dataset  = new ArrayList<Dataset>();
}

class Dataset {
    public String album_id;
    public String album_title;
    @SerializedName("album_images")
    List<AlbumImages> images = new ArrayList<AlbumImages>();
}
 
class AlbumImages {
    public String image_id;
    public String user_id;
    public String albumId;
}