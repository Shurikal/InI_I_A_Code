package design_patterns.decorator.beispiel;
public class Navigationssystem extends Ausstattung {

	public Navigationssystem (IAuto pIAuto) {

		super(pIAuto);
	}

	public int gibKosten() { // dekoriert die Kosten

		return auto.gibKosten() + 2500;
	}

	public void zeigeDetails() { // dekoriert die Details

		auto.zeigeDetails();
		System.out.print(", Navigationssystem");
	}
}
