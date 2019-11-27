package design_patterns.iterator.loesung.iterator;


import design_patterns.iterator.loesung.datenstruktur.Element;

public class KonkreterIterator implements IIterator
{
	int size=0;
	int index=0;
	Element data[];


	public KonkreterIterator (Element e[], int s)
	{
		data = e;
		size = s;
	}

	//Implementierung von hasNext()
	public boolean hasNext()
	{
		return index < size;
	}

	//Implementierung von next()
	public Element next()
	{
		return data[index++];
	}
} 