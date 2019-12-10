package design_patterns.memento;

public class MementoTest {
	 public static void main(String[] args) {
		 		
		 	// Initialisierung Caretaker
	        Caretaker caretaker = new Caretaker();
	        
	        
	        Lebensjahre  lebensjahre = new Lebensjahre();
	        
	        // Die Person wird 10 Jahre alt
	        lebensjahre.setState(10);
	        
	        // Die Person wird 15 Jahre alt, das Alter wird gespeichert.
	        lebensjahre.setState(15);
	        caretaker.addMemento( lebensjahre.save());
	        
	        // Die Person wird 20 Jahre alt, das Alter wird wiederum gespeichert
	        lebensjahre.setState(20);
	        caretaker.addMemento( lebensjahre.save());
	        
	        // Die Person wird 25, merkt dass das Leben fr�her einfacher war und dreht die Zeit zur�ck um wieder 20 zu sein:
	        lebensjahre.setState(25);
	        lebensjahre.restore( caretaker.getMemento(1));
	        
	        // Der Person hatte 20 viel besser in Erinnerung als es wirklich ist, also will Sie nochmal 5 Jahre zur�ck.
	        lebensjahre.restore( caretaker.getMemento(0));
	    }

}
