package design_patterns.facade.subsystem;

public class CDPlayer
{
	public void on()
	{
		System.out.println("DVD player has been switched on");
	}
	
	public void play(int trackNumber)
	{
		System.out.println("Track " + trackNumber + " has been started");
	}
	
	public void off()
	{
		System.out.println("DVD player has been switched off");
	}
}