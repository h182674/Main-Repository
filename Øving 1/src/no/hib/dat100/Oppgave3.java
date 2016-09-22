package no.hib.dat100;
import java.util.Scanner;

public class Oppgave3 {

	public static void main(String[] args) {
			
		Scanner in = new Scanner (System.in);
		System.out.print("Skriv inn antall sekunder: ");
		int s = in.nextInt();
		
		int sekunder = s % 60;
		int minutter = (s / 60)%60;
		int timer = (s /60)/60;
		
		System.out.println(timer + " timer " + minutter + " minutter " + sekunder + " sekunder ");
		
		in.close();
     }

}
