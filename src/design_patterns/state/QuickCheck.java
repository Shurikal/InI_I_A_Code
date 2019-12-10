package design_patterns.state;

public class QuickCheck implements MyState{

	int counter;

	@Override
	public void checkBeer(MyStateContext context, Beer beer) {
		System.out.println("--- Running small test ---");
		counter++;
		if(beer.checkLabel()){
			System.out.println("Beer is okay");
		}else{
			System.out.println("Beer is not okay!");
		}
		if(counter == 4) {
			context.setState(new ThoroughCheck());
		}
		
		//Hier kommt ihr Code
		
		//Für den QuickCheck soll vom Objekt "beer" das Label überprüft werden
		//Wenn das Label ok ist (true) soll das auf der Konsole ausgegeben werden, z.B.: System.out.println("Checking Label:      OK! -> bottle gets shipped!");
		//Wenn das Label schlecht ist (false) soll das ebenfalls auf der Konsole ausgegeben werden, z.B.: System.out.println("Checking Label:      BAD -> put bottle away");
		//Wenn für 4 Flaschen das Label überprüft wurde (QuickCheck), soll die fünfte Flasche gründlich überprüft werden (ThoroughCheck)
		//Ändern Sie zu diesem Zweck nach 4 QuickChecks den Zustand/State des Objekts "context" indem Sie einen neuen, passenden Zustand/State erzeugen und übergeben
		//Hinweis: Die Methode "setState" der Klasse "MyStateContext" ist noch nicht fertig
		
	}
}
