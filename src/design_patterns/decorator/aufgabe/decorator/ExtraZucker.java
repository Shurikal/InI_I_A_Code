package design_patterns.decorator.aufgabe.decorator;

import design_patterns.decorator.aufgabe.schnittstelle.IKaffee;

public class ExtraZucker extends Zutaten {

	public ExtraZucker (IKaffee pKaffee) {
		
		super(pKaffee);
	}

	public String getBeschreibung() {
		
		return kaffee.getBeschreibung() + ", mit extra Zucker";
	}

	public float getPreis() {
		
		return kaffee.getPreis() + 0.5f;
	}
}