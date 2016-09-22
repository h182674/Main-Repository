package no.hib.dat100;

import easyIO.*;

public class Oppgave1a {

	public static void main(String[] args) {

		int poengsum;
		In input = new In();
		Out skjerm = new Out();

		skjerm.outln(
				"Vennligst tast inn poengsummen din her for å få vite hvilken bokstavkarakter mellom A - F du fikk: ");
		poengsum = input.inInt();

		String karakter = ""; // Vi bruker string for å få en kortere kode
		if (poengsum >= 90 && poengsum <= 100) {
			karakter = "A";
		} else if (poengsum >= 80 && poengsum < 90) {
			karakter = "B";
		} else if (poengsum >= 60 && poengsum < 80) {
			karakter = "C";
		} else if (poengsum >= 50 && poengsum < 60) {
			karakter = "D";
		} else if (poengsum >= 40 && poengsum < 50) {
			karakter = "E";
		} else if (poengsum >= 0 && poengsum < 40) {
			karakter = "F";
		} else {
			karakter = "V"; // Laget spesifikt for verdier som ikke samsvarer
							// med poengrensene
		}

		if (karakter.equals("V")) {
			skjerm.out("Feilmelding: Poengsummen du oppga er ugyldig.");
		} else
			skjerm.out("Karakteren din ble: " + karakter);
	}

}