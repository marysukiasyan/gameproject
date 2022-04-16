public class Board {

//    public static final int BOARD_ROWS =4;
//    public static final int BOARD_COLUMNS =4;
//    private Figure[][] board;
//    public enum FigureColor {WHITE, BLACK};
//
//    public Board() {
//        this.board = new Figure[BOARD_ROWS][BOARD_COLUMNS];
//    }
//}

    public static final int BOARD_RANKS = 4;
    public static final int BOARD_FILES = 4;
    private String[][] board;
    public final String EMPTY = "()";
    public enum FigureColor {WHITE, BLACK};


   //  no-arg constructor to automatically initialize the board
    public Board() {
        this.board = new String[BOARD_RANKS][BOARD_FILES];
        for (int i = 0; i < BOARD_RANKS; i++)
            for (int j = 0; j < BOARD_FILES; j++)
                this.board[i][j] = EMPTY;
    }

    public String[][] getBoard() {
        //returns deep copy
        String[][] board = new String[BOARD_RANKS][BOARD_FILES];
        for (int i = 0; i < BOARD_RANKS; i++)
            for (int j = 0; j < BOARD_FILES; j++)
                board[i][j] = this.board[i][j];
        return board;
    }

   //  class position hasn't written yet
    public boolean isEmpty(Position p){
        return this.board[p.getRow()][p.getColumn()] == EMPTY;
    }

    public boolean isGameOver() {
        return false;
    }

}