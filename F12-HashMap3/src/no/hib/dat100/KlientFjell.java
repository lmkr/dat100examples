package no.hib.dat100;
import java.util.HashMap;

public class KlientFjell {

	public static void main(String[] args) {
		FjellRegister fjellR = new FjellRegister();
				
		// Lese inn data
		fjellR.setteInn();
		fjellR.setteInn();
		fjellR.setteInn();
		fjellR.setteInn();
		fjellR.setteInn();
		
		//Skrive ut 
		fjellR.skrivMap();
		
		//Søke
		fjellR.soke();
		
		//Endre og skrive ut
		fjellR.endre();
		fjellR.skrivMap();
		
		//Fjerne og skrive ut
		fjellR.fjerne();
		fjellR.skrivMap();
	}
}
/*
 * Oppgi navn på fjell :a
 
Oppgi høyden i meter :1
Oppgi navn på fjell :b
Oppgi høyden i meter :2
Oppgi navn på fjell :c
Oppgi høyden i meter :3
Oppgi navn på fjell :d
Oppgi høyden i meter :4
Oppgi navn på fjell :e
Oppgi høyden i meter :5

Innholdet i HashMap
a	1 meter
b	2 meter
c	3 meter
d	4 meter
e	5 meter
Oppgi navn på fjell som skal søkes etter :d
Fjellet er registert d	d meter
Oppgi navn på fjell som skal få ny høyde :c
Oppgi den nye høyden i meter :7


Innholdet i HashMap
a	1 meter
b	2 meter
c	7 meter
d	4 meter
e	5 meter
Oppgi navn på fjell som skal fjernes :
d


Innholdet i HashMap
a	1 meter
b	2 meter
c	7 meter
e	5 meter

Noen virkelige fjell
("Galdhøpiggen", 2246)
("Glittertinden", 2465)
("Grytkollen", 1836)
("Midtre Fossafjell", 1708)
("Nordre Fossafjell", 1708)
*/
