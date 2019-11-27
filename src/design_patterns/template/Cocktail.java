package design_patterns.template;

public abstract class Cocktail
{
    abstract void zutatenHinzufuegen();
    public void garnieren(){}

    private void eiswuerfel(){
        System.out.println("Eiswürfel in Glas geben");
    }

    private void umruehren(){
        System.out.println("Umrühren");
    }

    final void cocktailMixen(){
        eiswuerfel();
        zutatenHinzufuegen();
        umruehren();
        garnieren();
    }
}