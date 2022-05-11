package game;

import java.util.Arrays;

/**
 * A class that stores the board for the game and other methods that have been used to create it.
 * @author Hripsime Melikyan
 * @author Meri Sukiasya
 * @author Arthur Aghamyan
 */

public class Quarto implements Cloneable {

    /**
     * A static instance variable that initializes the size of the Quarto board.
     */

    public static final int BOARD_ROWS = 4;

    /**
     * A static instance variable that initializes the size of the Quarto board.
     */

    public static final int BOARD_COLUMNS = 4;

    /**
     * The board of the game, which have a figure type.
     */

    private Figure[][] board;

    /**
     * The two possible colors of the figures of Quarto game.
     */

    public enum FigureColor {RED, BLUE};
    public FigureColor figureColors;
    //    public static final String PLAYER1 = "Player 1";
    //    public static final String PLAYER2 = "Player 2";

    /**
     * The name of the first player.
     */

    private String Player1 = "Player 1";

    /**
     * The name of the second player.
     */

    private String Player2 = "Player 2";

    /**
     * The number of turns.
     */

    private int turn = 0;

    /**
     * A constructor that receives and initializes the names of the players.
     * It also initializes the board and turns.
     * @param player1
     * @param player2
     */

    public Quarto(String player1,String player2) {
        this("----" +
                        "----" +
                        "----" +
                        "----" );
    //    board[1][2] = new Figure();
        this.turn = 0;
        this.board = new Figure[BOARD_ROWS][BOARD_COLUMNS];
        this.Player1 = player1;
        this.Player2 = player2;
    }

    /**
     * An accessor to get first players name.
     * @return
     */

    public String getPlayer1() {
        return Player1;
    }

    /**
     * An accessor to get second players name.
     * @return
     */

    public String getPlayer2() {
        return Player2;
    }


    /**
     * A no arg constructor that initializes the board
     * @param arrangement
     */

    public Quarto(String arrangement) {
        this.board = new Figure[BOARD_ROWS][BOARD_COLUMNS];

        }

    /**
     * A mutator to increase the number of turns with 1.
     */

    public void increaseTurn(){
        turn += 1;
    }

    /**
     * A method that gives the name of the player whos turn has come.
     * @return
     */

    public String  getTurn(){
        if (turn % 2 ==0)
            return this.getPlayer1();
        return this.getPlayer2();
    }

    /**
     * An accessor for the board.
     * @return
     */
    public Figure[][] getBoard() {
        Figure[][] copy = new Figure[BOARD_ROWS][BOARD_COLUMNS];
        for (int i = 0; i < BOARD_ROWS; i++)
            for (int j = 0; j < BOARD_COLUMNS; j++)
                if (this.board[i][j] != null)
                    copy[i][j] = (Figure) this.board[i][j].clone();
        return copy;
//        return this.board;
    }

    /**
     * An overridden clone method.
     * @return
     */
    public Quarto clone() {
        try {
            Quarto copy = (Quarto) super.clone();
            copy.board = this.getBoard();
            return copy;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }


    /**
     * A method that given the position and figure appends the figure to the given position of the board.
     * @param p
     * @param figure
     * @return
     */

    public Figure[][] addFigureToBoard(Position p, Figure figure){
        if ((p.getRow() >= 0 && p.getColumn() < BOARD_COLUMNS) ||
                (p.getColumn() >= 0 && p.getRow() < BOARD_ROWS)
                        && board[p.getRow()][p.getColumn()] == null){
                board[p.getRow()][p.getColumn()] = figure;
            }
            return board;
        }


    /**
     * A method that given two coordinates of position in board checks whether it is empty or not.
     * @param i
     * @param j
     * @return
     */

    private boolean isEmpty(int i, int j){
        if (this.board[i][j] == null) {
            return true;
        }
        return false;
    }

    /**
     * A method that checks whether the game is ongoing or it is over and someone won.
     * @return
     */

    public boolean isGameOver() {
        // check horizontal

        for (int i = 0; i < BOARD_ROWS; i++) {
            if (!isEmpty(i, 0) && !isEmpty(i, 1) && !isEmpty(i, 2) && !isEmpty(i, 3)) {
                if (this.board[i][0].getColor() == this.board[i][1].getColor() &&
                        this.board[i][0].getColor().equals(this.board[i][2].getColor()) &&
                        this.board[i][0].getColor() == this.board[i][3].getColor()
                )
                    return true;

                if (this.board[i][0].isHole() == this.board[i][1].isHole() &&
                        this.board[i][0].isHole() == this.board[i][2].isHole() &&
                        this.board[i][0].isHole() == this.board[i][3].isHole())
                    return true;
                if (this.board[i][0].isTall() == this.board[i][1].isTall() &&
                        this.board[i][0].isTall() == this.board[i][2].isTall() &&
                        this.board[i][0].isTall() == this.board[i][3].isTall())
                    return true;
                if (this.board[i][0].isSquare() == this.board[i][1].isSquare() &&
                        this.board[i][0].isSquare() == this.board[i][2].isSquare() &&
                        this.board[i][0].isSquare() == this.board[i][3].isSquare())
                    return true;
            }
        }
            //check verticals
        for (int j = 0; j < BOARD_COLUMNS; j++) {
            if (!isEmpty(0, j) && !isEmpty(1, j) && !isEmpty(2, j) && !isEmpty(3, j)) {
                if (this.board[0][j].getColor() == this.board[1][j].getColor() &&
                        this.board[0][j].getColor() == this.board[2][j].getColor() &&
                        this.board[0][j].getColor() == this.board[3][j].getColor()
                )
                    return true;
                if (this.board[0][j].isHole() == this.board[1][j].isHole() &&
                        this.board[0][j].isHole() == this.board[2][j].isHole() &&
                        this.board[0][j].isHole() == this.board[3][j].isHole())
                    return true;
                if (this.board[0][j].isTall() == this.board[1][j].isTall() &&
                        this.board[0][j].isTall() == this.board[2][j].isTall() &&
                        this.board[0][j].isTall() == this.board[3][j].isTall())
                    return true;
                if (this.board[0][j].isSquare() == this.board[1][j].isSquare() &&
                        this.board[0][j].isSquare() == this.board[2][j].isSquare() &&
                        this.board[0][j].isSquare() == this.board[3][j].isSquare())
                    return true;
            }
        }

         //   check diagonals
        if (!isEmpty(0,0) && !isEmpty(1,1) && !isEmpty(2,2) && !isEmpty(3,3)) {
            if (this.board[0][0].getColor() == this.board[1][1].getColor() &&
                    this.board[0][0].getColor() == this.board[2][2].getColor() &&
                    this.board[0][0].getColor() == this.board[3][3].getColor()
            )
                return true;
            if (this.board[0][0].isHole() == this.board[1][1].isHole() &&
                    this.board[0][0].isHole() == this.board[2][2].isHole() &&
                    this.board[0][0].isHole() == this.board[3][3].isHole())
                return true;
            if (this.board[0][0].isTall() == this.board[1][1].isTall() &&
                    this.board[0][0].isTall() == this.board[2][2].isTall() &&
                    this.board[0][0].isTall() == this.board[3][3].isTall())
                return true;
            if (this.board[0][0].isSquare() == this.board[1][1].isSquare() &&
                    this.board[0][0].isSquare() == this.board[2][2].isSquare() &&
                    this.board[0][0].isSquare() == this.board[3][3].isSquare())
                return true;
        }

        if (!isEmpty(0,3) && !isEmpty(1,2) && !isEmpty(2,1) && !isEmpty(3,0)){

            if (this.board[0][3].getColor() == this.board[1][2].getColor() &&
                    this.board[0][3].getColor() == this.board[2][1].getColor() &&
                    this.board[0][3].getColor() == this.board[3][0].getColor()
            )
                return true;
            if (this.board[0][3].isHole() == this.board[1][2].isHole() &&
                    this.board[0][3].isHole() == this.board[2][1].isHole() &&
                    this.board[0][3].isHole() == this.board[3][0].isHole())
                return true;
            if (this.board[0][3].isTall() == this.board[1][2].isTall() &&
                    this.board[0][3].isTall() == this.board[2][1].isTall() &&
                    this.board[0][3].isTall() == this.board[3][0].isTall())
                return true;
            if (this.board[0][3].isSquare() == this.board[1][2].isSquare() &&
                    this.board[0][3].isSquare() == this.board[2][1].isSquare() &&
                    this.board[0][3].isSquare() == this.board[3][0].isSquare())
                return true;
        }

        return false;
    }

    /**
     * A method that prints string representation of board.
     * @return
     */


    @Override
    public String toString() {
        return "" + Arrays.deepToString(board);
    }

    /**
     * A method fo printing the board, and showing the players empty and filled places on it.
     */

    public  void printBoard(){
        for (int i = 0; i  < Quarto.BOARD_ROWS; i++){
            for (int j = 0; j < Quarto.BOARD_COLUMNS; j++){
                if (board[i][j] == null)

                    System.out.printf("%10s",(i+1)+ " "+(j+1));
                else
                    System.out.printf("%10s",board[i][j] + " " );
            }
            System.out.println();
        }
    }
}
