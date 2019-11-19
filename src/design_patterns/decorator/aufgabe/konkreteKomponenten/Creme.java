package design_patterns.decorator.aufgabe.konkreteKomponenten;

import design_patterns.decorator.aufgabe.schnittstelle.IKaffee;

public class Creme implements IKaffee {

	public String getBeschreibung() {
		
		return "Kaffee Creme";
	}

	public float getPreis() {
		
		return 4.5f;
	}
}