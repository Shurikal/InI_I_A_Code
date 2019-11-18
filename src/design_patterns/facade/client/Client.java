package design_patterns.facade.client;

import design_patterns.facade.facade.*;
public class Client
{
	public static HomeCinemaFacade homeCinema;
		
	public static void main(String[] args)
	{	
		homeCinema = new HomeCinemaFacade();
		
		// watch movie
		homeCinema.watchMovie("Inception");
		
		System.out.println("------------------------------------------------------------");
		
		// stop watching movie
		homeCinema.endMovie();
	}
}