package game;

public class TallSquare extends Figure {
    private final boolean isTall = true;
    private final boolean isSquare = true;

    public TallSquare(Quarto.FigureColor color, boolean hole) {
        super(color, hole);
    }

    public boolean isTall() {
        return isTall;
    }

    public boolean isSquare() {
        return isSquare;
    }


    @Override
    public String toString() {
        if (this.getColor() == Quarto.FigureColor.BLUE && this.isHole()) {
            return "TSBH"; //TallSquareBlueHole
        }
        if (this.getColor() == Quarto.FigureColor.BLUE && !this.isHole()){
            return "RSBS"; // TallSquareBlueSmooth
        }
        if (this.getColor() == Quarto.FigureColor.RED && this.isHole()){
            return "TSRH"; // TallSquareRedHole
        }
        if (this.getColor() == Quarto.FigureColor.RED && !this.isHole()){
            return "TSRS"; //TallSquareRedSmooth
        }
        return " ";
    }
}
