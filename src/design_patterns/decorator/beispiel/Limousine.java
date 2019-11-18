package design_patterns.decorator.beispiel;
public class Limousine implements IAuto {

	public int gibKosten () {
		
		return 35000;
	}
	
	public void zeigeDetails () {
		
		System.out.print("Limousine");
	}
}
