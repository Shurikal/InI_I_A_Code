package design_patterns.facade.subsystem;

public class Amplifier
{
	public void on()
	{
		System.out.println("Amplifier has been switched on");
	}
	
	public void setDVD()
	{
		System.out.println("Amplifier input has been switched to 'DVD'");
	}
	
	public void enableSurroundSound()
	{
		System.out.println("Surround Sound has been turned on");
	}
	
	public void disableSurroundSound()
	{
		System.out.println("Surround Sound has been turned off");
	}
	
	public void setVolume(int volume)
	{
		System.out.println("Volume has been changed to '" + volume + "'");
	}
	
	public void off()
	{
		System.out.println("Amplifier has been switched off");
	}
}