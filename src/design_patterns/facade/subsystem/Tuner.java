package design_patterns.facade.subsystem;

public class Tuner
{
	public void on()
	{
		System.out.println("Screen has been switched on");
	}
	
	public void changeChannel(int channelNumber)
	{
		System.out.println("Channel has been switched to channel " + channelNumber);
	}
	
	public void off()
	{
		System.out.println("Screen has been switched off");
	}
}
