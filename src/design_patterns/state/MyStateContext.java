package design_patterns.state;

public class MyStateContext {
	
	private MyState state;
	
	public MyStateContext() {
		state = new QuickCheck();
	}
	
	public void setState(MyState newState) {
		state = newState;
	}
	
	public void checkBeer(Beer beer) {
		state.checkBeer(this,beer);
		//Hier kommt Ihr Text
		
		//An dieser Stelle soll die Methode checkBeer des Objekts "State" aufgerufen werden
		//Was müssen Sie dieser Methode für Objekte übergeben?
		//Hinweis: Es geht um das aktuelle Objekt
		//Hilfreiche Links:
		//https://study.com/academy/lesson/this-keyword-in-java-meaning-use.html
		//https://en.wikipedia.org/wiki/State_pattern
	}
}
