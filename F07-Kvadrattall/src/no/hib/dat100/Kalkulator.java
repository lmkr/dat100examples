package no.hib.dat100;
import java.util.Scanner;
	//to push
	public class Kalkulator {
	  double[] beregnTiRoetter() {
	    // leser ti tall fra terminal, regner ut kvadratrot og
	    // returnerer en (peker til en) tabell av double-tall
		Scanner tastatur = new Scanner(System.in);
	    double[] r = new double[10];
	    for (int i = 0 ; i < 10; i++) {
	       System.out.print("Gi et flyttall:");
	       double d = tastatur.nextDouble();
	       r[i] = Math.sqrt(d); // metodekall– aktuell parameter d
	    }
	    return r; // retur
	  }//metode
	  
	}//class
