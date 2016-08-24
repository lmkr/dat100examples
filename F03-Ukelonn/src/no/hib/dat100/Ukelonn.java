package no.hib.dat100;
import java.util.Scanner;
public class Ukelonn {

	public static void main(String[] args) {
		final double NORMALUKE = 37.5;
		final double TILLEGG = 2000.0;
		double antallTimer;
		double ukelonn;
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Oppgi antall timer: ");
		antallTimer = tastatur.nextDouble();
		if(antallTimer <= NORMALUKE){
			ukelonn = 6000.0;
		}
		else if(antallTimer <= 42.0){
			ukelonn = 6000.0 + (antallTimer-NORMALUKE)*400.0;			
		}
		else{
			ukelonn = 6000.0 + (antallTimer-NORMALUKE)*400.0 + TILLEGG;
		}
		System.out.printf("Ukelonnen %.1ftimer er %.2f kr %n", antallTimer, ukelonn);	

	}

}
