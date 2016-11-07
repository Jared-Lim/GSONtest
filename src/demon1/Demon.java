package demon1;

import java.util.ArrayList;

public class Demon {
	private String tribe;
	private String nameJP;
	private String nameEN;
	private int level;
	
	private ArrayList<ArrayList<String>> specialfusion 
		= new ArrayList<ArrayList<String>>();
	
	public String toString(){
		return    "--tribe: "+tribe+
				"\n--nameJP: "+nameJP+
				"\n--nameEn: "+nameEN+
				"\n--level: "+level+
				"\n--FUS: "+specialfusion;
	}
}
