package GameOfLife;

import javax.swing.JFrame;

public class Display extends JFrame {
    public Display() {
        this.add(new Panel());
        this.setTitle("Game Of Life");
        this.setLocation(0, 0);
        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.pack();
    }
}
