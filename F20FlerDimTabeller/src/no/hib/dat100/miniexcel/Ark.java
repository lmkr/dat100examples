package no.hib.dat100.miniexcel;

public class Ark {

	int[][] data;

	public Ark(int[][] data) {
		this.data = data;
	}

	public void skrivUt() {

		System.out.println("---------------");

		// TODO - START
		// iterer igjennom tabellen og skriv ut

		for (int[] rad : data) {
			for (int v : rad) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
		// TODO _END

		System.out.println("---------------");
	}

	public void beregnSum() {

		// TODO - START

		// summer hver rad og skriv summen i siste element
		for (int r = 0; r < data.length - 1; r++) {

			int sum = 0;

			for (int k = 0; k < data[r].length - 1; k++) {
				sum = sum + data[r][k];
			}

			int sisteindex = data[r].length - 1;
			data[r][sisteindex] = sum;
		}

		// TODO - END

		// TODO - START

		// summer hver kolonne og skrive summen i siste element
		int sistekolonne = data[0].length - 1; // antar alle har samme lengde
		int sisterad = data.length - 1;
		for (int k = 0; k < sistekolonne; k++) {

			int sum = 0;
			for (int r = 0; r < sisterad; r++) {
				sum = sum + data[r][k];
			}

			data[sisterad][k] = sum;
		}

		// TODO - END

	}
}
