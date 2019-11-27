package design_patterns.iterator.aufgabe.iterator;


import design_patterns.iterator.aufgabe.datenstruktur.Element;

public class KonkreterIterator implements IIterator{
	
	private int size;
	private int index=0;
	private Element[] data;

	public KonkreterIterator (Element e[], int s) {
		data = e;
		size = s;
	}

	public boolean hasNext() {
		return index < size;
	}

	public Element next() {
		return data[index++];
	}
} 