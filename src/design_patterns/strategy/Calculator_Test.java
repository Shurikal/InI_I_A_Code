package design_patterns.strategy;

public class Calculator_Test 
{
	public static void main(String[] args)
	{
		//Addition: 5 + 3
		Calculator_Context cAdd = new Calculator_Context(new Add()) ;
		System.out.println("5 + 3 = " + cAdd.calculate(5, 3));

		//Subtraktion: 5 - 3
		Calculator_Context cSub = new Calculator_Context(new Substract()) ;
		System.out.println("5 - 3 = " + cSub.calculate(5, 3));

		//Multiplikation: 5 * 3
		Calculator_Context cMult = new Calculator_Context(new Multiply()) ;
		System.out.println("5 * 3 = " + cMult.calculate(5, 3));
	}
}
