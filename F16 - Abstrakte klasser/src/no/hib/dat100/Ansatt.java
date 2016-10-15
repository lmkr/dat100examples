package no.hib.dat100;

public abstract class Ansatt {
	private String navn;
	private double timelonn;
	private double bonusfaktor;

	public Ansatt(String na, double tl, double bf) {
		navn = na;
		timelonn = tl;
		bonusfaktor = bf;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public double getTimelonn() {
		return timelonn;
	}

	public void setTimelonn(double timelonn) {
		this.timelonn = timelonn;
	}

	public double getBonusfaktor() {
		return bonusfaktor;
	}

	public void setBonusfaktor(double bonusfaktor) {
		this.bonusfaktor = bonusfaktor;
	}

	public void skriv() {
		System.out.println("Navn: " + navn);
		System.out.println("Timelønn: " + timelonn);
		System.out.println("Bonusfaktor: " + bonusfaktor);
		System.out.println("Bonus: " + beregnbonus());
	}

	public abstract double beregnbonus();

}
