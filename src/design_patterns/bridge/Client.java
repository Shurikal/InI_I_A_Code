package design_patterns.bridge;

public class Client {
	
	public static void main(String args[]){
        Color color = new Blue();
        Form form = new Circle(color);
        form.addColor();
        
        color = new Red();
        form = new Square(color);
        form.addColor();
	}    
        
}