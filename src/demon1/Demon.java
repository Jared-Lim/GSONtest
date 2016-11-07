package demon1;

public class Demon {
	private String tribe;
	private String nameJP;
	private String nameEN;
	private int level;
	
	private String[][] fusions;
	
	public String toString(){
		return    "--tribe: "+tribe+
				"\n--nameJP: "+nameJP+
				"\n--nameEn: "+nameEN+
				"\n--level: "+level+
				"\n--FUS: "+fusions[0][0]+" + "+fusions[0][1]+" + "+fusions[0][2];
	}
	
	public String arrayOutput(String[][] fuse){
		StringBuilder str = new StringBuilder();
		
		for(int i=0;i<fuse.length;i++){
			str.append(fuse[0][i]);
		}
		
		return str.toString();
	}
}
