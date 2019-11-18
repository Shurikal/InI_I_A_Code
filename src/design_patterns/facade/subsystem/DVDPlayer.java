package design_patterns.facade.subsystem;

public class DVDPlayer
{
	private String movie;
	
	public void on()
	{
		System.out.println("DVD player has been switched on");
	}
	
	public void play(String movie)
	{
		this.movie = movie;
		
		System.out.println("The movie '" + movie + "' has been started");
	}

	public void stop()
	{
		System.out.println("The movie '" + movie + "' has been stopped");
	}
	
	public void eject()
	{
		System.out.println("The DVD has been ejected");
	}
	
	public void off()
	{
		System.out.println("DVD player has been switched off");
	}
}