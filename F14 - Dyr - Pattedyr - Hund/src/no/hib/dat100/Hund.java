package no.hib.dat100;

public class Hund extends Pattedyr {

	public Hund() {
		System.out.println("Hund()");
	}

	public Hund(String parameter) {
		super(parameter);
		System.out.println("Hund(\"" + parameter + "\")");
	}

}
