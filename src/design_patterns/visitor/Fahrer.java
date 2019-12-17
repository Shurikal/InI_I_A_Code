package design_patterns.visitor;

public class Fahrer implements Person
{

    @Override
    public void visit(Audi audi) {
        audi.fahren();
    }

    @Override
    public void visit(Mercedes mercedes) {
        mercedes.fahren();
    }
}
