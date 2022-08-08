package GameOfLife;

import java.util.ArrayList;

public class Cell {
    private boolean alive;
    private boolean changes;
    private int x;
    private int y;

    Cell(int x, int y) {
        this.x = x;
        this.y = y;
        alive = false;
    }

    public void lookForLivingNeighbors() {
        ArrayList <Cell> aliveNeighbors = new ArrayList();
        int nx;

    }

    public boolean checkNeighbor(Cell n) {
        return n.getAlive();
    }
    public void die() {
        alive = false;
    }
    public void born() {
        alive = true;
    }
    public boolean getAlive() {
        return this.alive;
    }
}
