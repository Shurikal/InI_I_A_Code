package design_patterns.bridge;

public class Square extends Form{
	
	public Square(Color color){
        super(color);
         }

    public void addColor(){
        System.out.print("Square create with:  " );
        color.handleColor();
    }

}





