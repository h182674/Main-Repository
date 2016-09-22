package no.hib.dat100;
import easyIO.*;

public class Oppgave5a {

	public static void main(String[] args) {
		final int bredde = 10;
		Out skjerm = new Out ();
		
		skjerm.outln("a", bredde, Out.CENTER);
		skjerm.outln("a a", bredde, Out.CENTER);
		skjerm.outln("a b a", bredde, Out.CENTER);
		skjerm.outln("a c c a", bredde, Out.CENTER);
		skjerm.outln("a d f d a", bredde, Out.CENTER);
		
	}

}
