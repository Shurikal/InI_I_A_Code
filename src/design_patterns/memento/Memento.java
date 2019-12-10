package design_patterns.memento;

public class Memento {
	private int state;
	
	public Memento(int age) {
		this.state = age;
	}
	
	public int getState() {
		return state;
	}

}
