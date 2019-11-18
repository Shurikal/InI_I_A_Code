package design_patterns.facade.subsystem;

public class Lights
{
	public void on()
	{
		System.out.println("Lights have been switched on");
	}
	
	public void dim(int percentage)
	{
		System.out.println("Lights have been dimmed to " + percentage + "%");
	}
	
	public void undim()
	{
		System.out.println("Lights have been undimmed back to 100%");
	}
	
	public void off()
	{
		System.out.println("Lights have been switched off");
	}
}
