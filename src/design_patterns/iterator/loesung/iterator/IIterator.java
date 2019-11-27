package design_patterns.iterator.loesung.iterator;


import design_patterns.iterator.loesung.datenstruktur.Element;

public interface IIterator {

	public boolean hasNext();
	public Element next();
	
}
