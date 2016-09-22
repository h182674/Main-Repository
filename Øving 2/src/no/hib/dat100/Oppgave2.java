package no.hib.dat100;
import easyIO.*;

public class Oppgave2 {

	public static void main(String[] args) {
		
		int x;
		int y;
		int z; 
		
		In input = new In();
		
		System.out.println("Skriv inn det første tallet: ");
		x = input.inInt();
		System.out.println("Skriv nå inn det andre tallet: ");
		y = input.inInt();
		System.out.println("Skriv nå inn det tredje tallet: ");
		z = input.inInt();
		
		if ( x > y && x > z)
			System.out.println("Det største tallet er: " + x);
		else if ( y > x && y > z)
			System.out.println("Det største tallet er: " + y);
		else if ( z > x && z > y)
			System.out.println("Det største tallet er: " + z);
		
			}
		
	}
