package no.hib.dat100.kontakter;

public class KontaktInfo {
	
	private KontaktType type;
	private int nummer;
	
	public KontaktInfo(KontaktType type, int nummer) {
		this.type = type;
		this.nummer = nummer;
	}

	public KontaktType getType() {
		return type;
	}

	public void setType(KontaktType type) {
		this.type = type;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public void visDetaljer() {
		System.out.println("Type   : " + type);
		System.out.println("Nummer : " + nummer);
		System.out.println("-------------------");
		
	}
}
