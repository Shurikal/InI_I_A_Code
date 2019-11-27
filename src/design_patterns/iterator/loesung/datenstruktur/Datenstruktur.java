package design_patterns.iterator.loesung.datenstruktur;

import design_patterns.iterator.loesung.iterator.IIterator;
import design_patterns.iterator.loesung.iterator.KonkreterIterator;


public class Datenstruktur implements IDatenstruktur{

	final int max = 10;
	Element[] data = new Element[max];
	int index = 0;
	
	public IIterator createIterator()
	{
		return new KonkreterIterator(data, index);
	} 

	public void add (Element e)
	{
		if(index < max - 1)
		{
			data[index++] = e;
		}
	}

}
