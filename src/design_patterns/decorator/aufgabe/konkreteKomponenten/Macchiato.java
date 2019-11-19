package design_patterns.decorator.aufgabe.konkreteKomponenten;

import design_patterns.decorator.aufgabe.schnittstelle.IKaffee;

public class Macchiato implements IKaffee {

	public String getBeschreibung() {
		
		return "Latte Macchiato";
	}

	public float getPreis() {
		
		return 6.7f;
	}
}