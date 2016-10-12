package no.hib.dat100;

import java.util.HashMap;

public class HusHashMap {
	public static void main(String[] args) {
		HashMap <Integer, Hus> husene = new HashMap<Integer, Hus>();
		for (int i = 1; i < 10; i++) {
			husene.put(i, new Hus("Olav" + i));

		}

		for (Hus h : husene.values()) {
			System.out.println(h.getEier());
		}
	}
}
