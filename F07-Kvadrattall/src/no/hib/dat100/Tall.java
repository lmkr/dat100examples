package no.hib.dat100;

public class Tall  {
		  public static void main(String[] args) {
		    Kalkulator r = new Kalkulator(); // Oppretter et objekt
		    double[] roetter = r.beregnTiRoetter();//returenerer en tabell av tall

		    for (int k = 0; k < 10; k++){
		       System.out.println(roetter[k]); //skriver ut innholdet av tabellen
		   }  
		  }//main
		}// class




