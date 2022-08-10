package GraphicGameOfLife;

import javax.swing.JFrame;

public class Display extends JFrame {

    public Display(int w, int h) {
        this.setTitle("Game Of Life");
        this.setLocation(0, 0);
        this.setSize(w,h);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new Panel());
        //this.pack();
    }
}
