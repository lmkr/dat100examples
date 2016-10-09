package no.hib.dat100;

public class TestMinRandom {
	public static void main(String[] args) {
		MinRandom r = new MinRandom();

		System.out.print("Terningkast: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(r.terningkast() + " ");
		}
		System.out.println();
		System.out.println();

		System.out.print("Generelle terningkast (1...100): ");
		for (int i = 0; i < 10; i++) {
			System.out.print(r.terningkast(100) + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("Tilfeldige flyttal mellom 10.5 og 19.3: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(r.mellom(10.5, 19.3) + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("Metode frå Random: " + r.nextBoolean());
	}
}
