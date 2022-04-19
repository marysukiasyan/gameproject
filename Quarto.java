
public class Quarto {

    public static final int BOARD_RANKS = 4;
    public static final int BOARD_FILES = 4;
    private Figure[][] board;
    public enum FigureColor {WHITE, BLACK};
    public FigureColor figureColors;



   //  no-arg constructor to automatically initialize the board
    public Quarto() {
        this.board = new Figure[BOARD_RANKS][BOARD_FILES];
        for (int i = 0; i < BOARD_RANKS; i++)
            for (int j = 0; j < BOARD_FILES; j++)
                this.board[i][j] = new Figure();
    }

    public Figure[][] getBoard() {
        //returns deep copy
        Figure[][] board = new Figure[BOARD_RANKS][BOARD_FILES];
        for (int i = 0; i < BOARD_RANKS; i++)
            for (int j = 0; j < BOARD_FILES; j++)
                board[i][j] = new Figure();
        return board;
    }

    public boolean isEmpty(Position p){
        return this.board[p.getRow()][p.getColumn()] == new Figure();
    }

    public boolean isGameOver() {
        return false;

    }

}
