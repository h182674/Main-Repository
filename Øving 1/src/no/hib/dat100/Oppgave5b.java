package no.hib.dat100;
import easyIO.*;

public class Oppgave5b {

	public static void main(String[] args) {
		final int b1 = 10;
		final int b2 = 12;
		final int b3 = 10;
		Out skjerm = new Out();
		
		skjerm.out("Bilmerke", b1);
		skjerm.out("Årsmodell", b2);
		skjerm.outln("Reg.nr.", b3);
		
		System.out.println("-----------------------------");
		
		skjerm.out("Mercedes", b1);
		skjerm.out("1999", b2);
		skjerm.outln("UE65660",b3);
		
		skjerm.out("Ford", b1);
		skjerm.out("2003", b2);
		skjerm.outln("ZE95523",b3);
		
		skjerm.out("Toyota", b1);
		skjerm.out("2006", b2);
		skjerm.outln("DK53401",b3);
	
		System.out.println("-----------------------------");
	
	}

}
