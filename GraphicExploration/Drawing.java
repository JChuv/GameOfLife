package GraphicExploration;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.RenderingHints;
import java.awt.geom.*;
import javax.swing.JPanel;

public class Drawing extends JPanel {
    private int width;
    private int height;

    public Drawing (int w, int h) {
        this.width = w;
        this.height = h;
        super.setBackground(new Color(170,220,190));
    }

    @Override
    protected void paintComponent(Graphics g) {
        //Call to JPanel's .paintComponent() method to paint background
        super.paintComponent(g);
        //Cast to Graphics2D and set RenderingHints to smooth curves
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        //Register the initial state of g2d to reset it later
        AffineTransform reset = g2d.getTransform();

        int x = width/2;
        int y1 = height;
        int y2 = 3 * (height/4);

        Line2D.Double l1 = new Line2D.Double(x, y1, x, y2);
        g2d.setColor(Color.DARK_GRAY);
        g2d.draw(l1);

        for (int i = 0; i < 100; i++) {
            g2d.rotate(Math.toRadians(45), x, y2);
            y1 = y2;
            y2 = 3 * (y2/4);   
            l1 = new Line2D.Double(x, y1, x, y2);
            g2d.draw(l1);
        }

        x = width/2;
        y1 = height;
        y2 = 3 * (height/4);

        g2d.setTransform(reset);

        for (int i = 0; i < 100; i++) {
            g2d.rotate(Math.toRadians(-45), x, y2);
            y1 = y2;
            y2 = 3 * (y2/4);   
            l1 = new Line2D.Double(x, y1, x, y2);
            g2d.draw(l1);
        }
    }

    private void paintFork(int x, int y1, int y2) {
        
    }

    
}