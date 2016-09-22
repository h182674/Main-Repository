package no.hib.dat100;
import easyIO.*;

public class Oppgave3a {

	public static void main(String[] args) {
		
		int nummer;
		In input = new In();
		
		System.out.println("Vennligst tast inn et tall for å få vite hvilken by tallet samsvarer med: ");
		nummer = input.inInt();
		
		switch (nummer) {
		
		case 1:
			System.out.println("Bydel 1 heter Gamle Oslo");
			break;
		case 2:
			System.out.println("Bydel 2 heter Grünerløkka");
			break;
		case 3:
			System.out.println("Bydel 3 heter Sagene");
			break;
		case 4:
			System.out.println("Bydel 4 heter St.Hanshaugen");
			break;
		case 5:
			System.out.println("Bydel 5 heter Frogner");
			break;
		case 6:
			System.out.println("Bydel 6 heter Ullern");
			break;
		case 7:
			System.out.println("Bydel 7 heter Vestre Aker.");
			break;
		case 8 :
			System.out.println("Bydel 8 heter Nordre Aker.");
			break;
		case 9:
			System.out.println("Bydel 9 heter Bjerke.");
			break;
		case 10:
			System.out.println("Bydel 10 heter Grorud.");
			break;
		case 11:
			System.out.println("Bydel 11 heter Stovner.");
			break;
		case 12:
			System.out.println("Bydel 12 heter Alna.");
			break;
		case 13:
			System.out.println("Bydel 13 heter Østensjø.");
			break;
		case 14:
			System.out.println("Bydel 14 heter Nordstrand.");
			break;
		case 15:
			System.out.println("Bydel 15 heter Søndre Nordstrand.");
			break;
		default: 
			System.out.println("Du skrev inn et ugyldig tall.");
			break;
		
		}
		
	
	}

}
