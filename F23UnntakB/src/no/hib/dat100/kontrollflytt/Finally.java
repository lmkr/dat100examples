package no.hib.dat100.kontrollflytt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Finally {

	public static void main(String[] args) {
		
		try {
			HoustonWeHaveAProblem();
			if (false) {
				PrintWriter f = new PrintWriter (new FileWriter ("fil"));
				f.close ();
			}
			System.out.println("Kode rett etter en exception blir ikke utført");
		} catch (IOException e) {
			System.out.println("IO Exception");
		} finally {
			System.out.println("Finally kode - cleanup - blir utført også etter exception i try");
		}
		
		System.out.println("Kode etter try-catch-finally blir ikke utført hvis exception ikke fanges opp");
	}
	
	public static void HoustonWeHaveAProblem()
	{
		throw (new NullPointerException ("NULL POINTER"));
	}

}
