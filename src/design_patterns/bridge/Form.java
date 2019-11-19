package design_patterns.bridge;

abstract class Form {


	public Color color;	

	public Form(Color color){		
		this.color = color;
	}

	abstract void addColor();	  			

}


