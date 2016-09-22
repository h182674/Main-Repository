package no.hib.dat100;

public class Oppgave1 {

	public static void main(String[] args) {
		int i;
		
		System.out.println("Test av repetisjonssetning.");
		System.out.println("***************************");
		i = 1;
		
		while (i <= 10) {
		System.out.println("Dette er linje nr. " + i);
		
		if (i == 4) {
		System.out.println(); // Dette er egentlig ikke nødvendig, da alt den gjør er å hoppe over en linje.
		}
		
		if (i == 8) {
		System.out.println(); // Dette gjør akkurat det samme som ovenfor.
		}
		
		i = i + 1;
		
		}


	}

}
