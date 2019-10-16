package aufgaben.rekursion;

import javax.swing.*;
import java.awt.*;

public class PlotXY extends JFrame {
    // Define constants
    public static final int CANVAS_WIDTH  = 640;
    public static final int CANVAS_HEIGHT = 480;
    private int[] hof;

    // Declare an instance of the drawing canvas,
    // which is an inner class called DrawCanvas extending javax.swing.JPanel.
    private DrawCanvas canvas;

    // Constructor to set up the GUI components and event handlers
    public PlotXY() {
        Rekursion r = new Rekursion();
        r.hof(3000);

        hof = r.getHofbuffer();

        canvas = new DrawCanvas();    // Construct the drawing canvas
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

        // Set the Drawing JPanel as the JFrame's content-pane
        Container cp = getContentPane();
        cp.add(canvas);
        // or "setContentPane(canvas);"

        setDefaultCloseOperation(EXIT_ON_CLOSE);   // Handle the CLOSE button
        pack();              // Either pack() the components; or setSize()
        setTitle("Plot");  // "super" JFrame sets the title
        setVisible(true);    // "super" JFrame show
    }

    /**
     * Define inner class DrawCanvas, which is a JPanel used for custom drawing.
     */
    private class DrawCanvas extends JPanel {
        // Override paintComponent to perform your own painting
        @Override
        public void paintComponent(Graphics g) {
            draw(hof,g);
        }

        public void draw(int[] arr,Graphics g){
            int cacheX = 1;
            int cacheY = arr[1];

            for(int i = 2; i < hof.length-2;i++){
                g.drawLine(cacheX,this.getHeight()-cacheY,i,this.getHeight()-hof[i]);
                cacheX = i;
                cacheY = hof[i];
            }
        }
    }

    // The entry main method
    public static void main(String[] args) {
        // Run the GUI codes on the Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PlotXY(); // Let the constructor do the job
            }
        });
    }

}