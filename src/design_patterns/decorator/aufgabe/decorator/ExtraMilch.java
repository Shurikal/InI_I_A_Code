package design_patterns.decorator.aufgabe.decorator;

import design_patterns.decorator.aufgabe.schnittstelle.IKaffee;

public class ExtraMilch extends Zutaten {

	public ExtraMilch (IKaffee pKaffee) {
		
		super(pKaffee);
	}

	public String getBeschreibung() {
		
		return kaffee.getBeschreibung() + ", mit extra Milch";
	}

	public float getPreis() {
		
		return kaffee.getPreis() + 0.5f;
	}
}