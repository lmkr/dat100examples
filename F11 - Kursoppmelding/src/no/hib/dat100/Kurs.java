package no.hib.dat100;

public class Kurs {
	private final int STD = 300;
	private String kurskode;
	private Ukedag dag;
	private int tid;
	private Student[] studenter;
	private int antStudenter;
	
	Kurs(){
		studenter = new Student[STD];
		kurskode ="";
		dag = Ukedag.mandag;
		tid = 0;
		antStudenter = 0;
	}
	
	Kurs(String kode, Ukedag dag, int tid){		
		studenter = new Student[STD];
		kurskode = kode;
		this.dag = dag;
		this.tid = tid;
		antStudenter = 0;
		
	}

	public String getKurskode() {
		return kurskode;
	}

	public void setKurskode(String kurskode) {
		this.kurskode = kurskode;
	}

	public Ukedag getDag() {
		return dag;
	}

	public void setDag(Ukedag dag) {
		this.dag = dag;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getAntStudenter() {
		return antStudenter;
	}

	public void setAntStudenter(int antStudenter) {
		this.antStudenter = antStudenter;
	}
	
public boolean erFullt(){
	return antStudenter == studenter.length;
}

public void meldPåStudent(Student s){
	studenter[antStudenter] = s;
	antStudenter++;
}
	

}//class
