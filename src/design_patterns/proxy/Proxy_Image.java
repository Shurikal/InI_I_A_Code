package design_patterns.proxy;

public class Proxy_Image implements Image{
    private String filename;
    private Real_Image image;

    public Proxy_Image(String filename){
        this.filename = filename;
    }

    @Override
    public void displayImage() {
        if(image == null){
            image = new Real_Image(filename);
        }
        image.displayImage();
    }
}
