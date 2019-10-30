package design_patterns.proxy;

public class Real_Image implements Image {
    private String filename;

    public Real_Image(String filename){
        this.filename = filename;
        loadImage();
    }

    private void loadImage(){
        System.out.println("Loading "+filename);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying "+ filename);
    }
}
