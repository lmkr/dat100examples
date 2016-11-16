package no.hib.dat100.kontrollflytt;

public class C {
	
	public void mC() {

		D d = new D();

		System.out.println("mC: kalder d.mD");
		
		d.mD();
		
		System.out.println("mC: returnerer");
	}
}
