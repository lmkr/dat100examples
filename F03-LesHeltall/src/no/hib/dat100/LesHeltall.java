package no.hib.dat100;

import java.util.Scanner;

public class LesHeltall {

	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Oppgi et heltall: ");
		int tall = tastatur.nextInt();
		if (tall < 50) {
			System.out.println("Mindre enn 50");
		} else if (tall < 100) {
			System.out.println("Minst 50 og mindre enn 100");
		} else if (tall < 200) {
			System.out.println("Minst 100 og mindre enn 200");
		} else {
			System.out.println("Minst 200");
		}
	}
}