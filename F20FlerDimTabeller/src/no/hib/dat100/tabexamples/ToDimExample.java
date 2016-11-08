package no.hib.dat100.tabexamples;

public class ToDimExample {

	public static void main(String[] args) {
		
		Person[][] personer = new Person[2][3];
		
		personer[0][0] = new Person("A", "a@person.com");
		personer[0][1] = new Person("B", "b@person.com");
		personer[0][2] = new Person("C", "c@person.com");
		personer[1][0] = new Person("D", "d@person.com");
		personer[2][1] = new Person("E", "d@person.com");
		personer[3][2] = new Person("F", "f@person.com");

		// iterer over personer og skriv ut info for hver person
	}

}
