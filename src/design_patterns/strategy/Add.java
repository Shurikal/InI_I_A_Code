package design_patterns.strategy;

public class Add implements ICalculator
{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
    // int Methode um zwei (int) Parameter zu addieren
}
