package no.hib.dat100;

public class Pattedyr extends Dyr {

	public Pattedyr() {
		System.out.println("Pattedyr()");
	}

	public Pattedyr(String parameter) {
		super(parameter);
		System.out.println("Pattedyr(\"" + parameter + "\")");
	}

}

