package no.hib.dat100;

public class Hus {
	private String eier;
	private String adr;

	Hus(String e) {
		eier = e;
	}

	public String getEier() {
		return eier;
	}

	public void setEier(String eier) {
		this.eier = eier;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

}
