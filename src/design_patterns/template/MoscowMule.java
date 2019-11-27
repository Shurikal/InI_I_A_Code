package design_patterns.template;

public class MoscowMule extends Cocktail
{
    @Override
    public void zutatenHinzufuegen()
    {
        System.out.println("Wodka, Limettensaft und Ingwerbier hinzugefügt");
    }
    
    @Override
    public void garnieren()
    {
        System.out.println("Mit Minzblatt, Limettenschnitz und Gurkenscheibe garniert");
    }
}