package no.hib.dat100;

import easyIO.*;

public class Oppgave1b {

	public static void main(String[] args) {

		int poengsum;
		int a; // Elev

		In input = new In();
		Out skjerm = new Out();

		for (a = 1; a <= 10; a++) { // Her kan vi bruke enten en while-løkke
									// eller en for-løkke
			skjerm.outln(
					"Vennligst tast inn poengsummen din her for å få vite hvilken bokstavkarakter mellom A - F elev "
							+ a + " fikk: ");
			poengsum = input.inInt();

			String karakter = ""; // Vi bruker string for å få en kortere kode
			if (poengsum >= 90) {
				karakter = "A";
			} else if (poengsum >= 80) {
				karakter = "B";
			} else if (poengsum >= 60) {
				karakter = "C";
			} else if (poengsum >= 50) {
				karakter = "D";
			} else if (poengsum >= 40) {
				karakter = "E";
			} else if (poengsum >= 0) {
				karakter = "F";
			} else {
				karakter = "V"; // Laget spesifikt for verdier som ikke
								// samsvarer med poengrensene
			}

			if (karakter.equals("V")) {
				skjerm.outln("Feilmelding: Poengsummen du oppga er ugyldig.");
				a--;
			} else
				skjerm.outln("Karakteren din ble: " + karakter);
			skjerm.outln();
		}
	}

}