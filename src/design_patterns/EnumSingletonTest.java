package design_patterns;

public class EnumSingletonTest {

    public static void main(String[] args){

        EnumSingleton enumSingleton1 = EnumSingleton.getInstance();
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton3 = EnumSingleton.INSTANCE.getInstance();
        System.out.println(enumSingleton1.getInfo());
        enumSingleton1.setInfo("Test");
        System.out.println(enumSingleton1.getInfo());

    }
}
