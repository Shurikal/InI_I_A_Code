package design_patterns.visitor;

public class Audi implements Auto
{
	public void fahren()
	{
		System.out.println("Ich fahre Audi");
	}
	
	public void waschen()
	{
		System.out.println("Ich wasche Audi");
	}

	@Override
	public void accept(Person person) {
		person.visit(this);
	}
}
