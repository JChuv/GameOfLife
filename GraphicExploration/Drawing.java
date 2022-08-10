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
        super.setBackground(new Color(100,10,200));
    }

    @Override
    protected void paintComponent(Graphics g) {
        //Call to JPanel's .paintComponent() method to paint background
        super.paintComponent(g);
        //Cast to Graphics2D and set RenderingHints to smooth curves
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        
        for (int i = 0; i < width/2; i += 5) {
            Line2D.Double l1 = new Line2D.Double(i, 2*i, 50*i, 10*i);
            g2d.setColor(new Color (100, 255 - i, i));
            g2d.draw(l1);
        }
    }
}
