package design_patterns.decorator.beispiel;
public class Seitenairbags extends Ausstattung{

	public Seitenairbags (IAuto pIAuto) {

		super(pIAuto);
	}

	public int gibKosten() { // dekoriert die Kosten

		return auto.gibKosten() + 1000;
	}

	public void zeigeDetails() { // dekoriert die Details

		auto.zeigeDetails();
		System.out.print(", Seitenairbags");
	}
}
