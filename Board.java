import java.util.Scanner;

public class Board {
    private int width;
    private Scanner sc = new Scanner(System.in);
    private Cell[][] content;

    Board (int width) {
        this.width = width;
        content = new Cell[width][width];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                content[i][j] = new Cell(i, j);
            }
        }
    }
    
    //Inicia el tablero
    public void setup() {
        System.out.println("Introduce la anchura de la que quieres el tablero");
        sc.nextInt();
        
    }

    //Dibuja el tablero por pantalla
    public void paint() {
        String line = "";
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (content[i][j].getAlive()) {
                    line += "#";
                } else {
                    line += " ";
                }
                if (j == width - 1) {
                    System.out.println(line);
                }
            }
        }
    }

    //Actualiza las células del tablero
    public void turn() {

    }
}
