package GameOfLife;

public class GameOfLife {
    public static void main(String[] args) {
        Display d = new Display();
        PrimitiveBoard tablero = new PrimitiveBoard();
        while(true) {
            tablero.turn();
        }
    }
        
}
