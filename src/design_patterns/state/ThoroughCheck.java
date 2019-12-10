package design_patterns.state;

public class ThoroughCheck implements MyState{
	
	@Override
	public void checkBeer(MyStateContext context, Beer beer) {
		System.out.println("### Running big test ###");
		if(beer.checkLabel()){
			System.out.println("Label is okay");
		}else{
			System.out.println("Label is not okay!");
		}

		if(beer.checkTaste()){
			System.out.println("Taste is okay");
		}else{
			System.out.println("Taste is not okay!");
		}
		context.setState(new QuickCheck());
		
		//Hier kommt Ihr Text
		
		//Überprüfen Sie das Objekt "beer" auf das Label UND den Geschmack (betrachten Sie die Klasse "Beer")
		//Es gibt 4 verschiedene Fälle, alles ist gut, das Label ist schlecht, der Geschmack ist schlecht oder beides ist schlecht
		//Vorschläge für die Aktion bei diesen 4 Fällen:
		
		//	System.out.println("Checking thoroughly: OK! -> bottle gets shipped!");		
		
		//	System.out.println("Checking thoroughly: Label is BAD -> put bottle away");			
		
		//	System.out.println("Checking thoroughly: Taste is BAD -> put bottle away");
		
		//	System.out.println("Checking thoroughly: Label and Taste are BAD! -> get angry and throw bottle against the wall");
		
		//Nach jeder gründlichen Überprüfung sollen wieder die nächsten 4 Flaschen schnell überprüft werden (QuickCheck)
		//Ändern Sie zu diesem Zweck den Zustand/State des Objekts "context" indem Sie einen neuen, passenden Zustand/State erzeugen und übergeben
		//Hinweis: Die Methode "setState" der Klasse "MyStateContext" ist noch nicht fertig
		
	}
}
