import design_patterns.EnumSingleton;

public class Test {

    public static void main(String[] args){

        EnumSingleton enumSingleton1 = EnumSingleton.getInstance();
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton1.getInfo());
        enumSingleton1.setInfo("Test");
        System.out.println(enumSingleton1.getInfo());

    }
}