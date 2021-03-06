package demonize;

public class Demon {
	private String tribe;
	private String nameJP;
	private String nameEN;
	private int level;
	private Stats stats;
	private Affinities affinity;
	private Skills skills;
	private String[][] fusions;
	
	public String toString(){
		return    "--tribe: "+tribe+
				"\n--nameJP: "+nameJP+
				"\n--nameEn: "+nameEN+
				"\n--level: "+level+
				"\n--stats:\n"+
				"-------------------\n"+
				stats.toString()+
				"\n--affs:\n"+
				"-------------------\n"+
				affinity.toString()+
				"\n--skills:\n"+
				"-------------------\n"+
				skills.ListOfSkills.toString()+
				"\n--FUS: "+arrayOutput(fusions);
	}
	
	public String arrayOutput(String[][] fuse){
		StringBuilder str = new StringBuilder();
		
		for(int i=0;i<fuse[0].length;i++){
			str.append(fuse[0][i]);
			if(i + 1 < fuse[0].length){
				str.append(" + ");
			}
		}
		
		return str.toString();
	}
}