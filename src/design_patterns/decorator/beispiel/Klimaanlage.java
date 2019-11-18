package design_patterns.decorator.beispiel;
public class Klimaanlage extends Ausstattung {

	public Klimaanlage (IAuto pIAuto) {

		super(pIAuto);
	}

	public int gibKosten() { // dekoriert die Kosten

		return auto.gibKosten() + 1500;
	}

	public void zeigeDetails() { // dekoriert die Details

		auto.zeigeDetails();
		System.out.print(", Klimaanlage");
	}
}
