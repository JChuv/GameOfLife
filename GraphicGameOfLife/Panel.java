package GraphicGameOfLife;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Panel extends JPanel {
    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 800;
    static final int CELL_SIZE = 25;
    static final int WIDTH_IN_CELLS = SCREEN_WIDTH / CELL_SIZE;
    static final int HEIGHT_IN_CELLS = SCREEN_HEIGHT / CELL_SIZE;
    static final int DELAY = 200;
    private Random random;
    private boolean[][] world;
    

    public Panel() {
        this.random = new Random();
        this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        this.setBackground(Color.BLACK);
        this.start();
    }

    public void start() {
        world = new boolean[WIDTH_IN_CELLS][HEIGHT_IN_CELLS];
        for (int i = 0; i < WIDTH_IN_CELLS; i++) {
            for (int j = 0; j < HEIGHT_IN_CELLS - 1; j++) {
                world[i][j] = random.nextBoolean();
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGrid(g);
        drawWorld(g);
    }

    public void drawGrid(Graphics g) {
        for (int i = 0; i < SCREEN_WIDTH/CELL_SIZE; i++) {
            g.drawLine(i*CELL_SIZE, 0, i*CELL_SIZE, SCREEN_HEIGHT);
            g.drawLine(0, i*CELL_SIZE, SCREEN_WIDTH, i*CELL_SIZE);
        }
    }

    public void drawWorld(Graphics g) {
        for (int i = 0; i < WIDTH_IN_CELLS; i++) {
            for (int j = 0; j < HEIGHT_IN_CELLS; j++) {
                if (world[i][j] == true) {
                    g.fillRect(i*CELL_SIZE, j*CELL_SIZE, CELL_SIZE, CELL_SIZE);
                }
            }
        }
    }

    public int countAliveNeighbors(int x, int y) {
        int alive_neighbors = 0;
        if (x - 1 >= 0) {
            if ((y - 1 >= 0) && (world[x-1][y-1] == true)) {
                alive_neighbors++;
            }
            if (world[x-1][y] == true) {
                alive_neighbors++;
            }
            if ((y + 1 < world.length) && (world[x-1][y+1] == true)) {
                alive_neighbors++;
            }
        }
        if (x + 1 < world.length) {
            if ((y - 1 >= 0) && (world[x+1][y-1] == true)) {
                alive_neighbors++;
            }
            if (world[x+1][y] == true) {
                alive_neighbors++;
            }
            if ((y + 1 < world.length) && (world[x+1][y+1] == true)) {
                alive_neighbors++;
            }
        }
        if ((y - 1 >= 0) && (world[x][y-1] == true)) {
            alive_neighbors++;
        }
        if ((y + 1 < world.length) && (world[x][y+1] == true)) {
            alive_neighbors++;
        }
        return alive_neighbors;
    }


}
