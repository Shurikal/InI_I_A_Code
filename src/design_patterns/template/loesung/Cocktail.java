package design_patterns.template.loesung;

public abstract class Cocktail
{
    
    public void cocktailMixen()
    {
        eiswuerfel();
        zutatenHinzufuegen();
        umruehren();
        garnieren();
        System.out.println("Cheers!");
    }
    
    protected void eiswuerfel()
    {
        System.out.println("Eisw�fel ins Glas gef�llt");
    }
    
    abstract protected void zutatenHinzufuegen();
    
    protected void umruehren()
    {
        System.out.println("Cocktail umger�hrt");
    }
    
    protected void garnieren()
    {
    }
}