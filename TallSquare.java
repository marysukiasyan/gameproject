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
        if (this.getColor() == Quarto.FigureColor.BLACK && this.isHole()) {
            return "TallSquareBlackHole";
        }
        if (this.getColor() == Quarto.FigureColor.BLACK && !this.isHole()){
            return "TallSquareBlackSmooth";
        }
        if (this.getColor() == Quarto.FigureColor.WHITE && this.isHole()){
            return "TallSquareWhiteHole";
        }
        if (this.getColor() == Quarto.FigureColor.WHITE && !this.isHole()){
            return "TallSquareWhiteSmooth";
        }
        return " ";
    }
}
