package design_patterns.decorator.aufgabe.decorator;

import design_patterns.decorator.aufgabe.schnittstelle.IKaffee;

public class Karamell extends Zutaten {

	public Karamell (IKaffee pKaffee) {
		
		super(pKaffee);
	}

	public String getBeschreibung() {
		
		return kaffee.getBeschreibung() + ", mit Karamell";
	}

	public float getPreis() {
		
		return kaffee.getPreis() + 2.5f;
	}
}