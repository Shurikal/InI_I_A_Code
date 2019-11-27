import design_patterns.decorator.aufgabe.decorator.ExtraMilch;
import design_patterns.decorator.aufgabe.decorator.ExtraStark;
import design_patterns.decorator.aufgabe.decorator.ExtraZucker;
import design_patterns.decorator.aufgabe.decorator.Karamell;
import design_patterns.decorator.aufgabe.konkreteKomponenten.Creme;
import design_patterns.decorator.aufgabe.konkreteKomponenten.Espresso;
import design_patterns.decorator.aufgabe.konkreteKomponenten.Macchiato;
import design_patterns.decorator.aufgabe.schnittstelle.IKaffee;

public class Client {

	public static void main (String[] args) {
		
		// Aufgabe 3
		IKaffee kaffee = new ExtraStark(new ExtraMilch(new Creme()));
		
		System.out.println("Ihre Bestellung lautet:");
		System.out.println(kaffee.getBeschreibung());
		System.out.println("Preis: " + kaffee.getPreis() + " Fr\n");
		
		// Aufgabe 4
		kaffee = new Karamell(kaffee);
		
		System.out.println("Ihre bearbeitete Bestellung lautet:");
		System.out.println(kaffee.getBeschreibung());
		System.out.println("Preis: " + kaffee.getPreis() + " Fr\n");
		
		// Aufgabe 5
		IKaffee kaffee2 = new ExtraZucker(new Espresso());
		
		System.out.println("Ihre neue Bestellung lautet:");
		System.out.println(kaffee2.getBeschreibung());
		System.out.println("Preis: " + kaffee2.getPreis() + " Fr\n");
		
		// Aufgabe 6 (je nach Kraft und Lust :-) )
		IKaffee kaffee3 = new ExtraZucker(new ExtraMilch(new Karamell(new Macchiato())));
		
		System.out.println("Ihre neue Bestellung lautet:");
		System.out.println(kaffee3.getBeschreibung());
		System.out.println("Preis: " + kaffee3.getPreis() + " Fr\n");
	}
}