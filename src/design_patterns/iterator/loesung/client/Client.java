package design_patterns.iterator.loesung.client;

import design_patterns.iterator.loesung.datenstruktur.Datenstruktur;
import design_patterns.iterator.loesung.datenstruktur.Element;
import design_patterns.iterator.loesung.iterator.IIterator;

public class Client {
	
	public static void main(String[] args){

		Datenstruktur elementList;
		
		elementList = new Datenstruktur();
		elementList.add (new Element("Interstellar", "En"));
		elementList.add (new Element ("Scott Pilgrim", "De"));
		elementList.add (new Element ("Gone Girl", "De"));
		elementList.add (new Element ("Memento", "De"));
		elementList.add (new Element ("Prestige", "En"));
		elementList.add (new Element ("Fight Club", "En"));
		elementList.add (new Element ("Gesetz der Rache", "De"));
		elementList.add (new Element ("...", "..."));

		IIterator iter = elementList.createIterator();
		
		while (iter.hasNext()){		
			Element e = iter.next(); 
			System.out.println(e.getTitle() + " (" + e.getlanguage() + ")");
			System.out.println("--------------------------------");
		}
	}
}