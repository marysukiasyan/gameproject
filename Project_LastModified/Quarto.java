package gameproject.gameproject;

import java.util.Arrays;

public class Quarto {

    public static final int BOARD_RANKS = 4;
    public static final int BOARD_FILES = 4;
    private Figure[][] board;
    public enum FigureColor {WHITE, BLACK};
    public FigureColor figureColors;
    //private int numberOfMoves =0;
    public static final String PLAYER1 = "Player 1";
    public static final String PLAYER2 = "Player 2";
    private int turn = 0;

    public Quarto() {
        this("----" +
                        "----" +
                        "----" +
                        "----" );
    //    board[1][2] = new Figure();
        this.turn = 0;
    }


   //  no-arg constructor to automatically initialize the board
    public Quarto(String arrangement) {
        this.board = new Figure[BOARD_RANKS][BOARD_FILES];
//        for (int i = 0; i < arrangement.length(); i++) {
//            switch (arrangement.charAt(i)){
//
//            }

        }
//        for (int i = 0; i < BOARD_RANKS; i++)
//            for (int j = 0; j < BOARD_FILES; j++)
//                this.board[i][j] = "";
//    }

    public void increaseTurn(){
        turn += 1;
    }

    public String  getTurn(){
        if (turn % 2 ==0)
            return PLAYER1;
        return PLAYER2;
    }



    public Figure[][] getBoard() {
        //returns deep copy
        /*
        Figure[][] board = new Figure[BOARD_RANKS][BOARD_FILES];
        for (int i = 0; i < BOARD_RANKS; i++)
            for (int j = 0; j < BOARD_FILES; j++)
                this.board[i][j] = new Figure();

         */
        return this.board;
    }

    // copy new board = this.board
//    public boolean isEmpty(Position p){
 //       return this.board[p.getRow()][p.getColumn()] == new Figure();
//    }

    public Figure[][] addFigureToBoard(int row,int column, Figure figure){
        if (row >= 0 && column < 4){
            board[row][column] = figure;
        }
        return board;
    }


    public boolean isEmpty(int i, int j){
        if (this.board[i][j] == null) {
            return true;
        }
        return false;
    }

    public boolean isGameOver() {
        // check horizontal


        for (int i = 0; i < 4; i++) {
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
        for (int j = 0; j < 4; j++) {
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
                    this.board[0][0].isHole() == this.board[3][2].isHole())
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


    @Override
    public String toString() {
        return "" + Arrays.deepToString(board);
    }
}
