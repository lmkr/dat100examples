package no.hib.dat100;

public class VParam {

	static void m1(int tall, String... s) {
		System.out.println("tall:" + tall + ", s.length:" + s.length);
		for (int i = 0; i < s.length; i++) {
			System.out.println(" s[" + i + "]:" + s[i]);
		}
	} // end m1

	static void m2(int... a) {
		System.out.println("\n a.length:" + a.length);
		for (int i : a) {
			System.out.println("Neste i a:" + i);
		}
	} // end m2

}// class
