package GraphicExploration;

import javax.swing.JFrame;

public class Board {
    public static void main(String[] args) {
        int width = 650;
        int height = 650;
        JFrame board = new JFrame();
        board.setTitle("Dibujico");
        board.setSize(width, height);
        board.setVisible(true);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setLocationRelativeTo(null);

        board.add(new Drawing(width, height));
    }
}
