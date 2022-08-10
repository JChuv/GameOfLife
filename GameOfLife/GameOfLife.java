package GameOfLife;

public class GameOfLife {
    public static void main(String[] args) {
        PrimitiveBoard tablero = new PrimitiveBoard();
        while(true) {
            tablero.turn();
        }
    }
        
}
