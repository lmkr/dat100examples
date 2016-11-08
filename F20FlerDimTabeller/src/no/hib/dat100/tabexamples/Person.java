package no.hib.dat100.tabexamples;

public class Person {
	
	private String navn;
	private String epost;
	
	public Person(String name, String email) {
		navn = name;
		epost = email;
		
	}
	
	public String toString() {
		
		return 
				"navn  : " + navn + "\n" +
				"epost : " + epost;
	}
}
