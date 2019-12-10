package design_patterns.memento;

public class Lebensjahre {
	private int age;
	
	public void setState(int i){
		System.out.println("Neues Alter: "+ i);
		age = i;
	}

	public Memento save(){
		System.out.println("Alter gespeichert");
		return new Memento(age);
	}

	public void restore(Memento m){
		System.out.println("Alter wiederhergestellt: "+ m.getState());
		age = m.getState();
	}
}
