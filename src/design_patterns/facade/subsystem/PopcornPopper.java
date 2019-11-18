package design_patterns.facade.subsystem;

public class PopcornPopper
{
	public void on()
	{
		System.out.println("Popcorn popper has been switched on");
	}
	
	public void pop()
	{
		System.out.println("Popcorn is being heated...");
	}
	
	public void off()
	{
		System.out.println("Popcorn popper has been switched off");
	}
}