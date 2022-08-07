public class Board2 {
    //Board 15 x 15
    private char[][] board = {{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                              {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                              {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#','#',' ',' '},
                              {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#','#',' ',' ',' '},
                              {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#','#',' ',' '},
                              {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                              {' ',' ',' ',' ','#','#','#',' ',' ',' ',' ',' ',' ',' ',' '},
                              {' ',' ',' ','#','#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                              {' ',' ',' ',' ','#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                              {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                              {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                              {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#',' ',' ',' ',' '},
                              {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#','#',' ',' ',' '},
                              {' ','#',' ',' ',' ',' ',' ',' ',' ',' ','#',' ',' ',' ',' '},
                              {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}
                            };

    private char[][] changes = new char [15][15]; 
    Board2() {
        print();
    }

    public void print() {
        String line = "";
        System.out.println("_____________________________________");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                line += board[i][j];
                if (j == board.length - 1) {
                    System.out.println(line);
                    line = "";
                }
            }
        }
        System.out.println("_____________________________________");
    }

    public int countAliveNeighbors(int x, int y) {
        int alive_neighbors = 0;
        if (x - 1 >= 0) {
            if ((y - 1 >= 0) && (board[x-1][y-1] == '#')) {
                alive_neighbors++;
            }
            if (board[x-1][y] == '#') {
                alive_neighbors++;
            }
            if ((y + 1 < board.length) && (board[x-1][y+1] == '#')) {
                alive_neighbors++;
            }
        }

        if (x + 1 < board.length) {
            if ((y - 1 >= 0) && (board[x+1][y-1] == '#')) {
                alive_neighbors++;
            }
            if (board[x+1][y] == '#') {
                alive_neighbors++;
            }
            if ((y + 1 < board.length) && (board[x+1][y+1] == '#')) {
                alive_neighbors++;
            }
        }
        
        if ((y - 1 >= 0) && (board[x][y-1] == '#')) {
            alive_neighbors++;
        }
        if ((y + 1 < board.length) && (board[x][y+1] == '#')) {
            alive_neighbors++;
        }
        
        return alive_neighbors;
    }

    public void turn() {
        char state;
        int alive_neighbors;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                state = board[i][j];
                alive_neighbors = countAliveNeighbors(i, j);
                if ((state == ' ') && (alive_neighbors == 3)) {
                    changes[i][j] = '#';
                } else if ((state == '#') && (alive_neighbors == 2 || alive_neighbors == 3)) {
                    changes[i][j] = '#';
                } else {
                    changes[i][j] = ' ';
                }
            }
        }
        board = changes;
        changes = new char [15][15];
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        print();
    }
}
