package design_patterns.template;

public class Test_Cocktail {

	public static void main(String[] args) {
		
		System.out.println("Moscow Mule wird zubereitet...");
        MoscowMule mule = new MoscowMule();
        mule.cocktailMixen();
        
        System.out.println();
        
        System.out.println("Cuba Libre wird zubereitet...");
        CubaLibre libre = new CubaLibre();
        libre.cocktailMixen();
	}

}
