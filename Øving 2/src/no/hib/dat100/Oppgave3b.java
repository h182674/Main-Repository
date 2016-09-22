package no.hib.dat100;
import easyIO.*;

public class Oppgave3b {

	public static void main(String[] args) {
		
		int nummer;
		In input = new In();
		Out skjerm = new Out();
		 
		do {
		
		skjerm.out("Vennligst skriv inn et tall mellom 1 - 15 for å finne ut hvilken bydel tallet står for: ");
		nummer = input.inInt();
			
		switch (nummer) {
		
		case 1:
			skjerm.outln("Bydel nr. " + nummer + " heter Gamle Oslo");
			break;
		case 2:
			skjerm.outln("Bydel nr. " + nummer + " heter Grünerløkka");
			break;
		case 3:
			skjerm.outln("Bydel nr. " + nummer + " heter Sagene");
			break;
		case 4:
			skjerm.outln("Bydel nr. " + nummer + " heter St.Hanshaugen");
			break;
		case 5:
			skjerm.outln("Bydel nr. " + nummer + " heter Frogner");
			break;
		case 6:
			skjerm.outln("Bydel nr. " + nummer + " heter Ullern");
			break;
		case 7:
			skjerm.outln("Bydel nr. " + nummer + " heter Vestre Aker.");
			break;
		case 8 :
			skjerm.outln("Bydel nr. " + nummer + " heter Nordre Aker.");
			break;
		case 9:
			skjerm.outln("Bydel nr. " + nummer + " heter Bjerke.");
			break;
		case 10:
			skjerm.outln("Bydel nr. " + nummer + " heter Grorud.");
			break;
		case 11:
			skjerm.outln("Bydel nr. " + nummer + " heter Stovner.");
			break;
		case 12:
			skjerm.outln("Bydel nr. " + nummer + " heter Alna.");
			break;
		case 13:
			skjerm.outln("Bydel nr. " + nummer + " heter Østensjø.");
			break;
		case 14:
			skjerm.outln("Bydel nr. " + nummer + " heter Nordstrand.");
			break;
		case 15:
			skjerm.outln("Bydel nr. " + nummer + " heter Søndre Nordstrand.");
			break;
		default: if (nummer > 0)
			skjerm.outln("Du skrev inn et ugyldig tall.");
			else { 
			skjerm.outln("Avslutter program.");
		}
		}
	}while (nummer != 0);}
}
		 
