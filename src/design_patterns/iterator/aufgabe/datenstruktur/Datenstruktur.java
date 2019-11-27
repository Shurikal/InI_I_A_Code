package design_patterns.iterator.aufgabe.datenstruktur;

import design_patterns.iterator.aufgabe.iterator.IIterator;
import design_patterns.iterator.aufgabe.iterator.KonkreterIterator;

public class Datenstruktur implements IDatenstruktur{
	
	private final int max = 10;
	private Element[] data = new Element[max];
	private int index = 0;

	public IIterator createIterator() {
		return new KonkreterIterator(data, index);
	}
	
	public void add (Element e) {
		if(index < max - 1) {
			data[index++] = e;
		}
	}
}
