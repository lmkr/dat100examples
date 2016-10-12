package no.hib.dat100;

public class HusMain {
	public static void main(String[] args) {
		Object h1 = new Hus("Ola");
		Hus h2 = (Hus) h1;
		System.out.println(h2.getEier());

	}
}
