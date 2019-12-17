package design_patterns.visitor;

public class AutoTest {

	public static void main(String[] args) 
	{
		Audi A4 = new Audi();
		Mercedes amg = new Mercedes();
		Fahrer oli = new Fahrer();
		Waschmann serkan = new Waschmann();
		
		A4.accept(oli);
		A4.accept(serkan);
		amg.accept(oli);
		amg.accept(serkan);
		
		/*
		 *	Konsolenausgabe:
		 *	----------------
		 *
		 *	Ich fahre Audi
		 *	Ich wasche Audi
		 *	Ich fahre Mercedes
		 *	Ich wasche Mercedes
		 *
		 *	-------------------
		 * 
		 */
	}

}
