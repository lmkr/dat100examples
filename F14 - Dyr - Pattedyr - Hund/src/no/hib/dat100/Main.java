package no.hib.dat100;

public class Main {

	public static void main(String[] args) {

		strek();
		Hund fido = new Hund("fido");
		strek();

		strek();
		Hund nn = new Hund();
		strek();
	}

	private static void strek() {
		System.out.println("------------------------------");
	}
}