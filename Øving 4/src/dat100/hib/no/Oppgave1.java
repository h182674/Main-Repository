package dat100.hib.no;

public class Oppgave1 {
	public static void main(String[] args) {
		System.out.println("Del 1");
		int i = 1;
		while (i < 1) {
			System.out.println("Nr 1, i = " + i);
			// Gj�r ingenting s� lenge i er h�yere enn 0, gir utskrift ellers.
		}
		System.out.println("Del 2");
		for (int j = 1; j < 8; j = j * 2) {
			System.out.println("Nr 2, j = " + j); // j * 2 s� lenge j < 8, og
													// printer ut for hver
													// multiplikasjon.
		}
		System.out.println("Del 3");
		String s = "Test";
		for (int k = s.length() - 1; k > 0; k = k - 1) {
			System.out.println("Nr 3, k = " + s.charAt(k));
			// Setter int k = t i String "Test", og printer ut verdiene
			// k befinner seg p�,og avsluttes n�r k = 1.
		}
		System.out.println("Del 4");
		int tall = 7569;
		int hjelp = tall;
		int aS = 0;
		do {
			hjelp = hjelp / 10;
			aS = aS + 1;
		} while (hjelp > 0);
		System.out.println(
				tall + " kan bli dividert p� 10, " + aS + " ganger, f�r tallet ender opp som en desimal eller 0.");
		// Tallet divideres p� 10 helt til tallet blir 0 eller et double tall.
		// For
		// hver divisjon �kes aS med 1.
	}
}
