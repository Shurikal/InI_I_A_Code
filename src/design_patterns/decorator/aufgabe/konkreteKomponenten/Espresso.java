package design_patterns.decorator.aufgabe.konkreteKomponenten;

import design_patterns.decorator.aufgabe.schnittstelle.IKaffee;

public class Espresso implements IKaffee {

	public String getBeschreibung() {
		
		return "Espresso";
	}

	public float getPreis() {
		
		return 4.0f;
	}
}