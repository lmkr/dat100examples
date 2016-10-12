package no.hib.dat100;

public class VirtuellDemo {
	public static void main(String[] args) {
		A a = new A();
		a.skriv();

		// Alternativt: (new A()).skriv();

		B b = new B();
		b.skriv();
		C c = new C();
		c.skriv();
	}
}
