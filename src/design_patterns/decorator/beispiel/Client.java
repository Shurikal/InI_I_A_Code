package design_patterns.decorator.beispiel;
public class Client {

	public static void main (String[] args) {
		
		// Auto mit Klimaanlage
		IAuto auto = new Klimaanlage(new Limousine());
		auto.zeigeDetails();
		System.out.println("\nfuer " + auto.gibKosten() + " Franken\n");
		
		// Dynamische Erweiterung der Limousine mit Ausstattungen
		auto = new Navigationssystem(new Seitenairbags(auto));
		auto.zeigeDetails();
		System.out.println("\nfuer " + auto.gibKosten() + " Franken\n");
		
		// Cabrio Variante
		auto = new Seitenairbags(new Klimaanlage(new Cabrio()));
		auto.zeigeDetails();
		System.out.println("\nfuer " + auto.gibKosten() + " Franken\n");
	}
}
