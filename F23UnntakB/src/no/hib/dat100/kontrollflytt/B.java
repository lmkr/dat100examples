package no.hib.dat100.kontrollflytt;

public class B {

	public static void main(String[] args) {

		C c = new C();
		
		System.out.println("main: før c.mC");
		
		c.mC();

		System.out.println("main: etter c.mC");
	}
}
