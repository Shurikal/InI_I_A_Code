package design_patterns.bridge;

public class Circle extends Form {
	
	public Circle(Color color){
        super(color);
         }

    public void addColor(){
        System.out.print("Circle create with:  " );
        color.handleColor();
    }

}


