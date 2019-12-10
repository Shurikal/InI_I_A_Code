package design_patterns.state;

public class Brewery {
	
	private static Beer[] beers = new Beer[50];
	
	public static void main(String[] args) {
		produceBeers();
		
		MyStateContext context = new MyStateContext();
		
		for(Beer b : beers) {
			context.checkBeer(b);
		}
		
		System.out.println("");
		System.out.println("///////////////////////////////////////////////////////////////");
		System.out.println("");
		System.out.println("Job done");
	}
	
	public static void produceBeers() {
		for(int i = 0; i < beers.length ; i++) {
			if(i%7 == 0) {
				beers[i] = new Beer(true, false);
			}
			else if(i%15 == 0) {
				beers[i] = new Beer(true, false);
			}
			else if(i%25 == 0) {
				beers[i] = new Beer(false, false);
			}
			else {
				beers[i] = new Beer(true, true);
			}
		}
	}
	
	public static void checkAllBeersTest() {
		for(Beer b : beers) {
			System.out.println(String.valueOf(b.checkLabel()) + ", " + String.valueOf(b.checkTaste()));
		}
	}
}
