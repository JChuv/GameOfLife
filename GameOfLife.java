import java.util.Scanner;

public class GameOfLife {
    public static void main(String[] args) {
        Board2 tablero = new Board2();
        while(true) {
            tablero.turn();
        }
    }
        
}
