package design_patterns.iterator.aufgabe.iterator;

import design_patterns.iterator.aufgabe.datenstruktur.Element;

public interface IIterator {
	
	boolean hasNext();
	Element next();
	
}
