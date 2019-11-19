package design_patterns.decorator.aufgabe.decorator;

import design_patterns.decorator.aufgabe.schnittstelle.IKaffee;

public abstract class Zutaten implements IKaffee {

	protected IKaffee kaffee;
	
	public Zutaten (IKaffee pKaffee) {
		
		kaffee = pKaffee;
	}
}