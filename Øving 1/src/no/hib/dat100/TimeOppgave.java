package no.hib.dat100;
import java.util.Scanner;

public class TimeOppgave {

	public static void main(String[] args) {
		
		int n;
		int sum1 = 0;
		boolean gyldigInndata;
		
		Scanner in = new Scanner (System.in);
		do {
			System.out.print(" Tast inn n(et tall mellom 2 og 20):");
			 n = in.nextInt();
			gyldigInndata = (n >= 2) && (n <= 20);
			
			if (!gyldigInndata) {
				System.out.print("Feil inndata. " + n + " er ikke et tall mellom 2 og 20.");
			}
		
		} while (!gyldigInndata);
		int teller = 1;
		while (teller <= n) {
			sum1 = sum1 + teller;
			System.out.print(teller + " + ");
			teller = teller + 1; 
		}
		System.out.print(n + " = " + (sum1 + n));
		
		in.close();
	}

}