package design_patterns.visitor;

public class Waschmann implements Person
{

    @Override
    public void visit(Audi audi) {
        audi.waschen();
    }

    @Override
    public void visit(Mercedes mercedes) {
        mercedes.waschen();
    }
}
