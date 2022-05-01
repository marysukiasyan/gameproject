package gameproject.gameproject;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.setRow(row);
        this.setColumn(column);
    }

    public Position() {
        this.row = 0;
        this.column = 0;
    }

    public Position(Position other){
        this.row = other.row;
        this.column = other.column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        if(row>=0 && row < 4){
        this.row = row;
        }
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        if(column>=0 && column < 4) {
            this.column = column;
        }
    }


    public String toString() {
        return (row) +", "+(column)+"";
    }


}
