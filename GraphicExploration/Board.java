package GraphicExploration;

import javax.swing.JFrame;

public class Board {
    public static void main(String[] args) {
        int width = 500;
        int height = 500;
        JFrame board = new JFrame();
        board.setTitle("Dibujico");
        board.setSize(width, height);
        board.setVisible(true);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setLocationRelativeTo(null);

        board.add(new Drawing(width, height));
    }
}
