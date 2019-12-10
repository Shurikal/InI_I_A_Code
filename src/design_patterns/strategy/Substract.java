package design_patterns.strategy;

public class Substract implements ICalculator
{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }

}
