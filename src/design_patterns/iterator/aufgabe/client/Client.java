package design_patterns.iterator.aufgabe.client;

import design_patterns.iterator.aufgabe.datenstruktur.Datenstruktur;
import design_patterns.iterator.aufgabe.datenstruktur.Element;
import design_patterns.iterator.aufgabe.iterator.IIterator;

public class Client {
	
	public static void main(String[] args){

		Datenstruktur elementList = new Datenstruktur();

		elementList.add (new Element("Something"));
		elementList.add (new Element ("Something Spezial"));

		IIterator iter = elementList.createIterator();

		while (iter.hasNext()){		
			Element e = iter.next(); 
			System.out.println(e.getSomething());
		}
	}
}