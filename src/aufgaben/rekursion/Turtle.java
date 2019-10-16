package aufgaben.rekursion;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Turtle extends JFrame {

    public void start(){

        setColor(Color.BLACK);
        penDown();
        turnRight(Math.PI/4);
        walk(500);



    }

    public void penDown(){
        penDown = true;
    }

    public void penUp(){
        penDown = false;
    }

    public void walk(int i) {

        int xCache = cPosx + (int) (Math.cos(angle) * i);
        int yCache = cPosy - (int) (Math.sin(angle) * i);

        if (penDown) {

            //Y ausser Bereich
            if(yOoB(yCache)){
                System.out.println("TEST");
                double f = (getHeight()-1-cPosy)/Math.sin(angle);
                g.drawLine(cPosx,cPosy,(int)(f*Math.cos(angle)),(int)(f*Math.sin(angle)));
                cPosx =xCache;
                cPosy=yCache+getHeight();
                System.out.println(cPosx+" "+cPosy);
                g.drawLine((int)(f*Math.cos(angle)),0,cPosx,cPosy);
            }

        } else {
            cPosx = xOoB(xCache) ? xCache - image.getWidth() : xCache;
            cPosy = yOoB(yCache) ? yCache - image.getHeight() : yCache;
        }


    }

    public void setColor(Color c){
        g.setColor(c);
    }

    public void turnLeft(double rad){
        angle = angle + rad;
    }

    public void turnRight(double rad){
        angle = angle - rad;
    }

    public void setPos(int x, int y){
        cPosy = x;
        cPosy = y;
    }

    public int getColor(){

       return image.getRGB(cPosx,cPosy);
    }

    public void circle(int r){
        g.drawArc(cPosx,cPosy,r,r,0,360);
    }

    public void rectangle(int x, int y){

    }

    private boolean xOoB(int i){
        return i > image.getWidth()-1 || i <0;
    }

    private boolean yOoB(int i){
        return i > image.getHeight()-1 || i <0;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Turtle();
            }
        });
    }

    public Turtle(){
        image = new BufferedImage(CANVAS_WIDTH,CANVAS_HEIGHT, BufferedImage.TYPE_INT_RGB);
        g = image.createGraphics();

        g.setBackground(Color.WHITE);
        g.fillRect(0, 0, image.getWidth(), image.getHeight());
        g.setColor(Color.BLACK);
        g.drawLine(0,0,1,1);
        cPosx = CANVAS_WIDTH/2;
        cPosy =CANVAS_HEIGHT/2;
        angle = 0;

        start();

        getContentPane().add(new JLabel(new ImageIcon(image)));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setTitle("Turtle");
        setResizable(false);
        setVisible(true);
    }

    BufferedImage image;

    private Graphics2D g;

    private int cPosx,cPosy;
    private double angle;
    private boolean penDown;

    private static final int CANVAS_WIDTH  = 640;
    private static final int CANVAS_HEIGHT = 480;

}