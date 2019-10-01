package design_patterns;

public enum EnumSingleton {

    INSTANCE("Initial class info");

    private String info;

    private EnumSingleton(String info){
        this.info = info;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public void setInfo(String info){
        this.info = info;
    }

    public String getInfo(){
        return info;
    }
}
