package design_patterns.decorator.aufgabe.decorator;

import design_patterns.decorator.aufgabe.schnittstelle.IKaffee;

public class ExtraStark extends Zutaten {

	public ExtraStark (IKaffee pKaffee) {
		
		super(pKaffee);
	}

	public String getBeschreibung() {
		
		return kaffee.getBeschreibung() + ", extra stark";
	}

	public float getPreis() {
		
		return kaffee.getPreis() + 1.0f;
	}
}