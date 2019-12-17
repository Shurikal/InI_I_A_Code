package design_patterns.visitor;

public class Mercedes implements Auto
{
	public void fahren()
	{
		System.out.println("Ich fahre Mercedes");
	}
	
	public void waschen()
	{
		System.out.println("Ich wasche Mercedes");
	}

	@Override
	public void accept(Person person) {
		person.visit(this);
	}
}
