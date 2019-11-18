package design_patterns.decorator.beispiel;

public abstract class Ausstattung implements IAuto {

	protected IAuto auto;
	
	public Ausstattung (IAuto pIAuto) {
		
		auto = pIAuto;
	}
}
