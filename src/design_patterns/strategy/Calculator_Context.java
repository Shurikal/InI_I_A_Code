package design_patterns.strategy;

public class Calculator_Context 
{
	ICalculator c;
	
	public Calculator_Context(ICalculator c)
	{
		this.c = c;
	}
	
	public int calculate(int a, int b)
	{
		return c.calculate(a, b);
	}

}
