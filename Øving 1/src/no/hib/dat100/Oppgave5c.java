package no.hib.dat100;
import easyIO.*;

public class Oppgave5c {

	public static void main(String[] args) {
		
		double x;
		double y;
		
		In input = new In();
		
		System.out.print("Skriv inn et tall for x: ");
		x = input.inDouble();
		
		System.out.print("Skriv nå inn et tall for y: ");
		y = input.inDouble();
		
		System.out.print("Produktet av x og y er: " + x * y);

	}

}
