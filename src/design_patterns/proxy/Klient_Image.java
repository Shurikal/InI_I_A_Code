package design_patterns.proxy;

public class Klient_Image {
    public static void main(String[] args){
        Proxy_Image image1 =new Proxy_Image("Test");
        image1.displayImage();
        image1.displayImage();
    }
}
