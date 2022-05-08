package game;

/**
 * A mutable class for storing and representing a position on a quarto board.
 * @author Hripsime Melikyan
 * @author Meri Sukiasyan
 * @author Arthur Aghamyan
 */


public class Position {
    /**
     * Position row on the board, starting from the top.
     */

    private int row;
    /**
     * Position column on the board, starting from the top.
     */

    private int column;


    /** A parameterized constructor,that  initializes the rows and columns.
     * @param row
     * @param column
     */

    public Position(int row, int column) {
        this.setRow(row);
        this.setColumn(column);
    }

    /** A no-arg constructor, initializes with 0's.</p>
     */

    public Position() {
        this.row = 0;
        this.column = 0;
    }


    /** A copy constructor, initializes according to another Position object.
     * @param other The original position, according to which the new object is created.
     */

    public Position(Position other){
        this.row = other.row;
        this.column = other.column;
    }

    /**
     * Accessor method for the row of the position.
     * @return The row of the position.
     */

    public int getRow() {
        return row;
    }

    /**
     * Accessor method for the column of the position.
     * @return The column of the position.
     */

    public int getColumn() {
        return column;
    }

    /**
     * Mutator method for the row of the position.
     * @param row .
     */

    public void setRow(int row) {
        if(row>=0 && row < 4){
        this.row = row;
        }
    }

    /**
     * Mutator method for the column of the position.
     * @param column .
     */

    public void setColumn(int column) {
        if(column>=0 && column < 4) {
            this.column = column;
        }
    }


    /**
     * @return A string representation of the position on the board.
     * The user may not be a programmer , that's why we added +1 to rows and columns, not to start from 0;
     */

    public String toString() {
        return (row+1) +", "+(column+1)+"";
    }

    public static boolean isValidPosition(Position p){
        return (p.getRow()>=0 && p.getColumn() < 4);
    }


}
